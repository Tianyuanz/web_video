package Login;

import com.sun.rowset.JdbcRowSetResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
@WebServlet(name = "login",value = "/loginServlet")
public class login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest reqs, HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        DBConnetion mydb = new DBConnetion();
        operation op = new operation(mydb);
        String username = reqs.getParameter("username");
        String pwd = reqs.getParameter("userpwd");
        Type type=op.judge_pwd(username, pwd);
        if (type.b) {
            //成功 调用成功的Servlet
            System.out.println("成功");
            reqs.setAttribute("user",type.u);
            HttpSession session=reqs.getSession();
            session.setAttribute("isLogin","true");
            session.setMaxInactiveInterval(60*5);
            resp.sendRedirect("video.jsp");
        }
        else {
            //失败 调用失败的Servlet
            reqs.getRequestDispatcher("/defaul").forward(reqs,resp);
        }
    }

}
