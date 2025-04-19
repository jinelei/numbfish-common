package com.jinelei.numbfish.common.helper;

import com.jinelei.numbfish.common.exception.InvalidArgsException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 签名工具类
 */
@SuppressWarnings("unused")
public class SignatureHelper {
    private final String signatureHeader;
    private final String timestampHeader;
    private final String accessKeyHeader;

    public SignatureHelper(String signatureHeader, String timestampHeader, String accessKeyHeader) {
        this.signatureHeader = signatureHeader;
        this.timestampHeader = timestampHeader;
        this.accessKeyHeader = accessKeyHeader;
    }

    public String generateSignature(String accessKey, String secretKey, String timestamp, Map<String, String> params) {
        Optional.ofNullable(accessKey).orElseThrow(() -> new InvalidArgsException("AccessKey不存在"));
        Optional.ofNullable(secretKey).orElseThrow(() -> new InvalidArgsException("SecretKey不存在"));
        Optional.ofNullable(timestamp).orElseThrow(() -> new InvalidArgsException("Timestamp不存在"));
        Optional.ofNullable(params).orElseThrow(() -> new InvalidArgsException("参数不存在"));
        // 对参数进行排序并拼接
        final StringBuilder buffer = new StringBuilder();
        final String string = params.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .filter(i -> !i.getKey().equals(signatureHeader))
                .filter(i -> !i.getKey().equals(timestampHeader))
                .filter(i -> !i.getKey().equals(accessKeyHeader))
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.joining("&"));
        // 追加AccessKey、Timestamp和SecretKey
        buffer.append(string);
        if (!string.isEmpty()) {
            buffer.append("&");
        }
        buffer.append("AccessKey=").append(accessKey);
        buffer.append("&Timestamp=").append(timestamp);
        // 对参数进行签名，使用HMAC-SHA256算法
        String sign;
        try {
            final Mac mac = Mac.getInstance("HmacSHA256");
            final Key key = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
            mac.init(key);
            byte[] bytes = mac.doFinal(buffer.toString().getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(bytes);
        } catch (IllegalStateException | InvalidKeyException | NoSuchAlgorithmException e) {
            throw new InvalidArgsException("签名失败");
        }
    }

}
