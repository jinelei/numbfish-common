package com.jinelei.iotgenius.common.filter;

import com.jinelei.iotgenius.common.wrapper.RepeatRequestWrapper;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@SuppressWarnings("unused")
public class RepeatRequestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        if (request instanceof HttpServletRequest httpRequest) {
            chain.doFilter(new RepeatRequestWrapper(httpRequest), response);
        } else {
            chain.doFilter(request, response);
        }
    }

}