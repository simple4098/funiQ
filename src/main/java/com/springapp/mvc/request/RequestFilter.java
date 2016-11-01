/*
package com.springapp.mvc.request;

import com.springapp.mvc.domain.Users;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

*/
/**
 * DESC:
 * User: ZLin
 * Date: 14-10-12 Time: 下午2:17
 *//*


public class RequestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
        String context = httpServletRequest.getContextPath();
        Users users = (Users)httpServletRequest.getSession().getAttribute(Param.USER_NAME);
        if (null==users){
            httpServletResponse.sendRedirect(context + "/login");
            return;
        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
*/
