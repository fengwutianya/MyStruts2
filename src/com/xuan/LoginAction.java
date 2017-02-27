package com.xuan;

/**
 * Created by xuan on 2017/2/26 0026.
 */
public class LoginAction {
    private String userName;
    private String passWord;

    public String execute() {
        if (userName.equals("xuanxuan") && passWord.equals("123456")) {
            System.out.println("username=" + userName);
            System.out.println("password=" + passWord);
            return "success";
        } else {
            return "fail";
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
