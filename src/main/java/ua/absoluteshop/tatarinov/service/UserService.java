package ua.absoluteshop.tatarinov.service;

import ua.absoluteshop.tatarinov.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getUser();

    public User getUserByEmail(String email);

}