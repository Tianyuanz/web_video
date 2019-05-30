package pro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DishServlet",value = "/dishservlet")
public class DishServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Dish> dishList = new ArrayList<>();
        dishList.add(new Dish("鱼香肉丝","荤",4.00));
        dishList.add(new Dish("苦瓜炒肉","荤",4.00));
        dishList.add(new Dish("盘龙茄子","素",2.00));
        dishList.add(new Dish("刨猪汤","荤",22.00));

        request.setAttribute("dishList", dishList);

        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
