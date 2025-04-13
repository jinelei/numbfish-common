package com.jinelei.numbfish.common.helper;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ThrowableStackTraceHelper {

    /**
     * 将 Throwable 的栈信息转换为字符串
     *
     * @param throwable 要处理的 Throwable 对象
     * @return 包含栈信息的字符串
     */
    public static String getStackTraceAsString(Throwable throwable) {
        if (throwable == null) {
            return "";
        }
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }

}