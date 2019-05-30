package zty;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "A",value = "/a")
public class A extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.sendRedirect("/login/b");
//            System.out.println("A servlet 处理中....");
//            request.setAttribute("message","李子湖");
//            request.getRequestDispatcher("/b").forward(request,response);
    }
}
