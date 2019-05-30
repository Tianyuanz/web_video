<%--
  Created by IntelliJ IDEA.
  User: Aventador
  Date: 2019/5/28
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
%>
<html>
<head>
    <title>Title</title>
    <style>
        .center{
            margin-left: auto;
            margin-right: auto;
            width: 70%;
            background-color: white;
        }
    </style>
</head>
<body>
<%--    <video width="800" loop="loop" controls="controls ">--%>
<%--&lt;%&ndash;        <source src="../movie/<%=request.getParameter("video_name")%>.mp4" type=\"video/mp4\">&ndash;%&gt;--%>
<%--    <source src="/movie/1.mp4" type="video/mp4">--%>
<%--    <%--%>
<%--            System.out.println("<source src=\"../movie/1.mp4\" type=\"video/mp4\">");--%>
<%--        %>--%>
<%--    </video>--%>
<div class="center">
<video width="800"  loop="loop " controls="controls ">
    <source src="movie/<%=request.getParameter("video_name")%>.mp4" type="video/mp4">
<%--    <source src="movie/cat.mp4" type="video/mp4">--%>
</video>
</div>
<%
    System.out.println(request.getParameter("video_name"));
%>
</body>
</html>
