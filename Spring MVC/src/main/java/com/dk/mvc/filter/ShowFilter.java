package com.dk.mvc.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author DingKai
 * @Classname ShowFilter
 * @Description Simple Filter
 * @create 2019/3/4
 */
public class ShowFilter implements Filter {
    static Logger logger = LoggerFactory.getLogger(ShowFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter is init");
    }

    @Override
    public void destroy() {
        logger.info("Filter is destroy");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String protocol = servletRequest.getProtocol();
        HttpServletRequest httpServlet = (HttpServletRequest)servletRequest;
        Cookie[] cookies = httpServlet.getCookies();
        String requestURI = httpServlet.getRequestURI();
        String method = httpServlet.getMethod();

        logger.info("protocol :" + protocol + "\ncookies :" + cookies +
                "\nrequestURI :" + requestURI + "\nmethod :" + method);

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
