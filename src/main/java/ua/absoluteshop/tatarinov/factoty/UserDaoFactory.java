package ua.absoluteshop.tatarinov.factoty;

import ua.absoluteshop.tatarinov.dao.UserDao;
import ua.absoluteshop.tatarinov.dao.impl.UserDaoImpl;
import ua.absoluteshop.tatarinov.dao.impl.UserDaoPostgressImpl;

public class UserDaoFactory {

    private static UserDao instance;

    public static synchronized UserDao getUserDao() {
        if (instance == null) {
            instance = new UserDaoPostgressImpl();
        }
        return instance;
    }

}