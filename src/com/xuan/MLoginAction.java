package com.xuan;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xuan.pojo.User;

/**
 * Created by xuan on 2017/2/27 0027.
 */
public class MLoginAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }
    @Override
    public String execute() {
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        return "success";
    }
}
