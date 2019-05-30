<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="login.css"/>
</head>
<body >
    <div id="login">
        <h1 style="margin-left: 26px" >Login</h1>
        <form action="/login/loginServlet"  method="post">
            <table>
                <tr>
                <td>
                    <img src="账户.png" height="20" width="20" alt="">
                </td>
                    <td>
                        <input  type="text" placeholder="用户名" name="username">
                    </td>
                </tr>
                <tr>
                    <td>
                        <img src="密码.png" height="20" width="20" alt="">
                    </td>
                    <td>
                        <input  type="password" placeholder="密码" name="userpwd">
                    </td>
                </tr>
            </table>
            <div  align="left" style="float:left;margin-left: 26px" >
                <button class="but" type="submit">登陆</button>
            </div>
        </form>
        <form action="/login/signup.html" >
        <div align="right" style="float: right;margin-right: -25px">
         <button class="but" type="submit">注册</button>
        </div>
        </form>
        </div>
    </div>
</body>
<%
    String requesturl=request.getRequestURI();
    System.out.println(requesturl+" "+request.getContextPath());
%>
</html>