package Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "defaul",value = "/defaul")
public class defaul extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setHeader("Content-Type","text/html;charset=UTF-8");
            response.setCharacterEncoding("utf-8");
            response.getWriter().write("登录失败,请检查用户名或密码 点击链接转回登陆界面" +
                    "<a href=\"index.jsp\">重新登陆</a>");
            //response.sendRedirect("/login");
    }
}
