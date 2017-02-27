package com.xuan;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsStatics;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by xuan on 2017/2/27 0027.
 */
public class ThirdAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        ActionContext ac = ActionContext.getContext();
        ServletRequest request = (ServletRequest) ac.get(StrutsStatics.HTTP_REQUEST);
        ServletResponse response = (ServletResponse) ac.get(StrutsStatics.HTTP_RESPONSE);
        ServletContext context = (ServletContext) ac.get(StrutsStatics.SERVLET_CONTEXT);
        String name = request.getParameter("username");
        System.out.println("third way to get web sources username: " + name);
        return "success";
    }

}
