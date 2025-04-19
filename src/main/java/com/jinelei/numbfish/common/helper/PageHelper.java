package com.jinelei.numbfish.common.helper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jinelei.numbfish.common.request.PageRequest;

import java.util.Optional;

@SuppressWarnings("unused")
public class PageHelper {

    public static <T, R> IPage<T> toPage(IPage<T> page, PageRequest<R> request) {
        page.setCurrent(Optional.ofNullable(request.getPage()).orElse(1));
        page.setSize(Optional.ofNullable(request.getSize()).orElse(10));
        return page;
    }

}
