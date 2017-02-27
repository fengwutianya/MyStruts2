package com.xuan;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Map;

/**
 * Aware获取web资源no.2
 * 只是把request，response，context放在map对象中
 * 炫耀实现RequestAware接口
 * Created by xuan on 2017/2/27 0027.
 */
public class SecondAction extends ActionSupport implements RequestAware {
    private ServletResponse response;
    private ServletRequest request;
    private ServletContext context;

    @Override
    public void setRequest(Map<String, Object> map) {
        request = (ServletRequest)map.get(StrutsStatics.HTTP_REQUEST);
        response = (ServletResponse)map.get(StrutsStatics.HTTP_RESPONSE);
        context = (ServletContext)map.get(StrutsStatics.SERVLET_CONTEXT);
    }

    @Override
    public String execute() throws Exception {
        String name = request.getParameter("username");
        context.setAttribute("username", name);
        response.getOutputStream().println("<p>success</p>");
        return "success";
    }
}
