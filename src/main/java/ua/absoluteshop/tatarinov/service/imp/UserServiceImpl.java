package ua.absoluteshop.tatarinov.service.imp;

import ua.absoluteshop.tatarinov.dao.UserDao;
import ua.absoluteshop.tatarinov.db.Storage;
import ua.absoluteshop.tatarinov.factoty.UserDaoFactory;
import ua.absoluteshop.tatarinov.model.User;
import ua.absoluteshop.tatarinov.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final UserDao userDao = UserDaoFactory.getUserDao();

    @Override
    public void addUser(User user) { userDao.addUser(user); }

    @Override
    public List<User> getUser() { return userDao.getUser(); }

    @Override
    public User getUserByEmail(String email) { return Storage.getUserByEmail(email); }

}