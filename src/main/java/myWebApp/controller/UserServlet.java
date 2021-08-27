package myWebApp.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/userdb")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/userdb", "root", "06919991aH")){
                pw.println("Connection to UserDB successfully!");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                pw.println("Connection failed...");
            }
        } catch (Exception e) {
            pw.println("Connection failed...");
            e.printStackTrace();
        }
    }
}
