package filt;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebFilter(filterName = "Total",urlPatterns = "/*")
public class Total implements Filter {
    public void destroy() {

    }
    //private String[] excludeUrlList= {"/","/index.jsp","/about.jsp"};
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        final String requestURI = request.getRequestURI();
        if (requestURI.equals("/login/video.jsp") || requestURI.equals("/login/play.jsp")){
            final Object loginFlag = request.getSession().getAttribute("isLogin");
            if (loginFlag == null || ((String) loginFlag).length() == 0) {
                //没有登录
                response.sendRedirect(request.getContextPath() + "/");
                return;
            }

        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
