package ua.absoluteshop.tatarinov.factoty;

import ua.absoluteshop.tatarinov.dao.UserDao;
import ua.absoluteshop.tatarinov.dao.impl.UserDaoPostgressImpl;
import ua.absoluteshop.tatarinov.service.UserService;
import ua.absoluteshop.tatarinov.service.imp.UserServiceImpl;

public class UserServiceFactory {

    private static UserService instance;

    public static synchronized UserService getUserService() {
        if (instance == null) {
            instance = new UserServiceImpl();
        }
        return instance;
    }

}