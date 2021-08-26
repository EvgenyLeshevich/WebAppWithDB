package myWebApp.dao;

import myWebApp.model.User;

import java.util.ArrayList;

public interface DaoUserDb {
    ArrayList<User> select();
    User selectOne(int id);
    int insert(User obj);
    int update(User obj);
    int delete(int id);
}
