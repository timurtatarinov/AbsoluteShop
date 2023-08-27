package ua.absoluteshop.tatarinov.controller;

import ua.absoluteshop.tatarinov.factoty.UserServiceFactory;
import ua.absoluteshop.tatarinov.model.User;
import ua.absoluteshop.tatarinov.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {

    private static final UserService userService = UserServiceFactory.getUserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if ( count != null && count >= 5) {
            resp.sendRedirect("https:www.google.com");
        } else {
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            User userFromDb = userService.getUserByEmail(email);

            if (userFromDb != null) {
                String password1 = userFromDb.getPassword();
                if (password.equals(password1)) {

                    if (count != null) {
                        session.setAttribute("count", ++count);
                    } else {
                        session.setAttribute("count", 1);
                    }
                    req.getRequestDispatcher("main_admin_page.jsp").forward(req, resp);
                } else {
                    req.setAttribute("error", "You have mistake in your login or password!");
                    req.getRequestDispatcher("index.jsp").forward(req, resp);
                }
            } else {
                req.setAttribute("error", "You have mistake in your login or password!");
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            }
        }
    }

}