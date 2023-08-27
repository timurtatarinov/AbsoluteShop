package ua.absoluteshop.tatarinov.controller;

import ua.absoluteshop.tatarinov.model.User;
import ua.absoluteshop.tatarinov.service.UserService;
import ua.absoluteshop.tatarinov.service.imp.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class AllUsersServlet extends HttpServlet {

    private static final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> allUsers = userService.getUser();
        req.setAttribute("allUsers", allUsers);
        req.getRequestDispatcher("/users.jsp").forward(req, resp);
    }

}