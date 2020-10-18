package com.gupaoedu.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("--second--init----");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("________Second过滤器执行之前_________");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("________Second过滤器执行之后_________");
    }

    @Override
    public void destroy() {
        System.out.println("****destroy****");
    }
}
