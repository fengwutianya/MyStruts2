package com.xuan;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletRequest;

/**
 * Created by xuan on 2017/2/27 0027.
 */
public class FouthAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        ServletActionContext sac = (ServletActionContext) ServletActionContext.getServletContext();
        ServletRequest request = sac.getRequest();
        String username = request.getParameter("usernanme");
        return "success";
    }
}
