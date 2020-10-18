package com.gupaoedu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/first") // *代表拦截所有的
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----init----");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("________First过滤器执行之前_________");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("________First过滤器执行之后_________");
    }

    @Override
    public void destroy() {
        System.out.println("****destroy****");
    }
}
