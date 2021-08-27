package myWebApp.dao;

import myWebApp.model.User;

import java.util.ArrayList;
import java.util.List;

public interface DAO {
    void add(Object obj);

    Object read(int id);

    List<?> readAll();

    void update(int id, Object obj);

    void delete(int id);
}
