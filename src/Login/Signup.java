package Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Signup",value="/signup")
public class Signup extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username="\""+request.getParameter("username")+"\"";
        String email="\""+request.getParameter("email")+"\"";
        String pwd="\""+request.getParameter("pwd")+"\"";
        DBConnetion mydb=new DBConnetion();
        operation op=new operation(mydb);
        response.setHeader("Content-Type","text/html;charset=UTF-8");
        if(op.signup(username,email,pwd)){
            response.getWriter().write("注册成功");
        }
        else
        {
            response.getWriter().write("注册失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
