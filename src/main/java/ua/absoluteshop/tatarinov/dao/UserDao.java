package ua.absoluteshop.tatarinov.dao;

import ua.absoluteshop.tatarinov.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> getUser();

    User getUserByEmail(String email);

}