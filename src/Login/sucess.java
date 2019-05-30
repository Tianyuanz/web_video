package Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "sucess",value = "/sucess")
public class sucess extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            user u=(user)request.getAttribute("user");
            response.setHeader("content-type","text/hTml;charset=UTF-8");
            response.getWriter().write(
                    ("我的名字: "+u.getName()+"<br/>"+
                     "我的性别:"+u.getGender()+"<br/>"+
                     "我的号码:"+u.getPhone()+"<br/>"+
                     "我的邮箱:"+u.getEmail()+"<br/>"+
                     "我的学校:"+u.getSchool()+"<br/>"+
                     "我的兴趣:"+u.getHobits()+"<br/>"
                    ));
    }
}
