package com.syx.Filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 史翼璇
 * @create 2019/9/17
 */
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
        HttpSession session = httpServletRequest.getSession();
        System.out.println("session.getAttribute(\"username\") = " + session.getAttribute("username"));
        if (session.getAttribute("username")!=null){
            chain.doFilter(req, resp);
        } else {
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"denglu.jsp");
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
