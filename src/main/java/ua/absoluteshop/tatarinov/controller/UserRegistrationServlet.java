package ua.absoluteshop.tatarinov.controller;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.absoluteshop.tatarinov.factoty.UserServiceFactory;
import ua.absoluteshop.tatarinov.model.User;
import ua.absoluteshop.tatarinov.service.UserService;
import ua.absoluteshop.tatarinov.service.imp.UserServiceImpl;

import java.io.IOException;

public class UserRegistrationServlet extends HttpServlet {

    private static final UserService userService = UserServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req, resp);
        HttpSession session = req.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
        } else {
            session.setAttribute("count", count++ );
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email =  req.getParameter("email");
        String password =  req.getParameter("password");
        String rPassword = req.getParameter("rpassword");

        if (password.equals(rPassword)) {
            User user = new User(email, password);
            userService.addUser(user);
            resp.sendRedirect("/");

            System.out.println("Мы зарегистрировались!!!");
        } else {
            req.setAttribute("error", "Your password not correct!!!");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }

    }

}