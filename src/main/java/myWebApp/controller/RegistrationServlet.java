package myWebApp.controller;

import myWebApp.dao.UserDao;
import myWebApp.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setFirstName(req.getParameter("name"));
        user.setLastName(req.getParameter("lastName"));
        user.setLogin(req.getParameter("login"));
        user.setPassword(req.getParameter("password"));
        new UserDao().add(user);
        resp.sendRedirect(req.getContextPath()+"index.jsp");
    }
}
