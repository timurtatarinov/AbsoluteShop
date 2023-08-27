package ua.absoluteshop.tatarinov.dao.impl;

import ua.absoluteshop.tatarinov.dao.UserDao;
import ua.absoluteshop.tatarinov.db.Storage;
import ua.absoluteshop.tatarinov.model.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(User user) {
        if( user != null){
            Storage.addUser(user);
        }
    }

    @Override
    public List<User> getUser() { return Storage.getUsers(); }

    @Override
    public User getUserByEmail(String email) {
        return Storage.getUserByEmail(email);
    }
}