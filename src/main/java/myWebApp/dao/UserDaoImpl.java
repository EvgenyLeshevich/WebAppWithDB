package myWebApp.dao;

import myWebApp.model.User;

import java.sql.*;
import java.util.ArrayList;

//public class UserDaoImpl implements DAO {
//    String url = "jdbc:mysql://localhost:3306/shopdb";
//    String username = "root";
//    String password = "06919991aH";
//    @Override
//    public ArrayList<User> select() {
//        ArrayList<User> users = new ArrayList<User>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(url, username, password)){
//
//                Statement statement = conn.createStatement();
//                ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
//                while(resultSet.next()){
//
//                    int id = resultSet.getInt(1);
//                    String login = resultSet.getString(2);
//                    String password = resultSet.getString(3);
//                    User user = new User(id, login, password);
//                    users.add(user);
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return users;
//    }
//
//    @Override
//    public User selectOne(int id) {
//        User user = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(url, username, password)){
//
//                String sql = "SELECT * FROM users WHERE id=?";
//                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
//                    preparedStatement.setInt(1, id);
//                    ResultSet resultSet = preparedStatement.executeQuery();
//                    if(resultSet.next()){
//
//                        int userId = resultSet.getInt(1);
//                        String login = resultSet.getString(2);
//                        String password = resultSet.getString(3);
//                        user = new User(userId, login, password);
//                    }
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return user;
//    }
//
//    @Override
//    public int insert(User obj) {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(url, username, password)){
//
//                String sql = "INSERT INTO users (login, password) Values (?, ?)";
//                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
//                    preparedStatement.setString(1, obj.getLogin());
//                    preparedStatement.setString(2, obj.getPassword());
//                    preparedStatement.setString(3, obj.getFirstName());
//                    preparedStatement.setString(4, obj.getLastName());
//
//                    return  preparedStatement.executeUpdate();
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return 0;
//    }
//
//    @Override
//    public int update(User obj) {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(url, username, password)){
//
//                String sql = "UPDATE users SET login = ?, password = ? WHERE id = ?";
//                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
//                    preparedStatement.setString(1, obj.getLogin());
//                    preparedStatement.setString(2, obj.getPassword());
//                    preparedStatement.setInt(3, obj.getId());
//
//                    return  preparedStatement.executeUpdate();
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return 0;
//    }
//
//    @Override
//    public int delete(int id) {
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(url, username, password)){
//
//                String sql = "DELETE FROM users WHERE id = ?";
//                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
//                    preparedStatement.setInt(1, id);
//
//                    return  preparedStatement.executeUpdate();
//                }
//            }
//        }
//        catch(Exception ex){
//            System.out.println(ex);
//        }
//        return 0;
//    }
//}
