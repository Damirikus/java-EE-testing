import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.time.LocalDate;

public class SetCoockesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie1 = new Cookie("ID", "111");
        Cookie cookie2 = new Cookie("date", LocalDate.now().toString());

        cookie1.setMaxAge(24 * 60 * 60);
        cookie2.setMaxAge(24 * 60 * 60);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
