package ua.absoluteshop.tatarinov.dao.impl;

import ua.absoluteshop.tatarinov.dao.UserDao;
import ua.absoluteshop.tatarinov.db.Storage;
import ua.absoluteshop.tatarinov.model.User;

import java.util.List;

public class UserDaoPostgressImpl implements UserDao {

    @Override
    public void addUser(User user) { }

    @Override
    public List<User> getUser() { return null; }

    @Override
    public User getUserByEmail(String email) { return Storage.getUserByEmail(email); }

}
