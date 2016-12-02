<%--
  Created by IntelliJ IDEA.
  User: jiang
  Date: 2016/10/20
  Time: 下午11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
   <p>Index</p>
   <%
     out.println(request.getAuthType());
     out.println(request.getContextPath());
     out.println(request.getCookies());
     out.println(request.getHeader(""));
     out.println("上下文路径为："+request.getContextPath()+"<br>");
     out.println("Cookies:"+request.getCookies()+"<br>");
     out.println("Host:"+request.getHeader("Host")+"<br>");
     out.println("ServerName:"+request.getServerName()+"<br>");
     out.println("ServerPort:"+request.getServerPort()+"<br>");
     out.println("RemoteAddr:"+request.getRemoteAddr()+"<br>");
   %>
  </body>
</html>
