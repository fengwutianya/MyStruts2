<%--
  Created by IntelliJ IDEA.
  User: xuan
  Date: 2017/2/26 0026
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() +
    ":" + request.getServerPort() + path +"/";
%>
<html>
  <head>
    <title>登陆</title>
  </head>
  <body>
    <form method="post" action="<%=path%>/new/login.action">
      用户名：<input type="text" name="username"><br/>
      密码：<input type="password" name="password"><br/>
      <input type="submit" value="登陆">
    </form>
  </body>
</html>
