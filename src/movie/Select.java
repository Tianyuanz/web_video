package movie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/Select")
public class Select extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");
        DBConnetion connetion=new DBConnetion();
        opreation op=new opreation(connetion);
        String name=request.getParameter("video_name");
        if(op.judge(name)){
            //成功
            response.sendRedirect("/login/play.jsp?video_name="+name);
        }
        else
        {
            //失败
//            response.setHeader("Content-Type","text/html;charset=UTF-8");
//            response.setCharacterEncoding("utf-8");
            response.getWriter().write("查无此片 点击重新查找--> <a href=\"video.jsp\">重新查找</a>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
