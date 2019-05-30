package zty;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "B",value ="/b")
public class B extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("B servlet 处理中....");
            response.setHeader("Content-Type","text/html;charset=UTF-8");
            response.setCharacterEncoding("utf-8");
            String message=(String)request.getAttribute("message");
            response.getWriter().append("我是B ").append(message);
    }
}
