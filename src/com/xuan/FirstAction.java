package com.xuan;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用aware获取web资源no.1
 * 首先得是action
 * 然后获取request，response，context属性
 * Created by xuan on 2017/2/27 0027.
 */
public class FirstAction extends ActionSupport implements ServletRequestAware, ServletResponseAware, ServletContextAware {
    private ServletRequest request;
    private ServletResponse response;
    private ServletContext context;

    @Override
    public void setServletContext(ServletContext servletContext) {
        context = servletContext;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        request = httpServletRequest;
    }

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        response = httpServletResponse;
    }

    @Override
    public String execute() throws Exception {
        String name = request.getParameter("username");
        context.setAttribute("username", name);
        response.getOutputStream().println("<p>success</p>");
        return "success";
    }
}
