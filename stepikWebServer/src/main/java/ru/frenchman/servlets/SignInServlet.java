package ru.frenchman.servlets;

import ru.frenchman.model.User;
import ru.frenchman.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignInServlet extends HttpServlet {

    private final UserService userService;

    public SignInServlet(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (login != null && password != null) {
            User foundUser = userService.getUserByLogin(login);
            if (foundUser != null) {
                String signInLogin = foundUser.getLogin();
                String signInPass = foundUser.getPassword();

                if (login.equals(signInLogin) && password.equals(signInPass)) {
                    resp.setStatus(HttpServletResponse.SC_OK);
                    resp.setContentType("text/html; charset=utf-8");
                    resp.getWriter().println("Authorized: " + signInLogin);
                } else {
                    resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                    resp.setContentType("text/html; charset=utf-8");
                    resp.getWriter().println("Unauthorized");
                }
            } else {
                resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                resp.setContentType("text/html; charset=utf-8");
                resp.getWriter().println("Unauthorized");
            }
        }
    }
}
