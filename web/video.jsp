<%--
  Created by IntelliJ IDEA.
  User: Aventador
  Date: 2019/5/28
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page  import="movie.*,java.sql.*"  %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Title</title>
    <style>
        #login{
            position: absolute;
            top: 50%;
            left:50%;
            margin: -150px 0 0 -150px;
            width: 300px;
            height: 300px;
        }
        #login h1{
            color: black;
            /*text-shadow:0 0 10px;*/
            letter-spacing: 1px;
            text-align: center;
        }
        .but{
            width: 278px;
            min-height: 20px;
            display: block;
            background-color: #4a77d4;
            border: 1px solid #3762bc;
            color: #fff;
            padding: 9px 14px;
            font-size: 15px;
            line-height: normal;
            border-radius: 5px;
            margin: 0;
        }
        input{
            width: 278px;
            height: 18px;
            margin-bottom: 10px;
            outline: none;
            padding: 10px;
            font-size: 14px;
            color: black;
            /*text-shadow:1px 0px 1px ;*/
            border-top: 1px solid gray;
            border-left: 1px solid gray;
            border-right: 1px solid gray;
            border-bottom: 1px solid dimgray;
            border-radius: 4px;
            background-color: white;
        }
    </style>
</head>
<body>
<%--房东的猫--%>
<%--<video width="800"  loop="loop " controls="controls ">--%>
<%--    <source src="movie/1.mp4" type="video/mp4">--%>
<%--</video>--%>
<%--<video width="800"  loop="loop " controls="controls ">--%>
<%--    <source src="movie/captain.mp4" type="video/mp4">--%>
<%--</video>--%>
<div id="login">
    <form action="/login/Select" method="get">
    <h1 style="margin-left: 20px" >搜电影</h1>
    <input type="text" placeholder="请输入准确的电影名称" name="video_name">
        <button type="submit" class="but">查找</button>
    </form>
    <h1 style="margin-left: 20px" >电影列表:</h1>
    <%
        DBConnetion db=new DBConnetion();
        opreation op=new opreation(db);
        String[] e = op.find();
        for (String str:e)
            if(str!=null){
    %>
    <a href="/login/Select?video_name=<%=str%>"><%=str%></a>
    <%
        }
    %>

</div>
</body>
</html>
