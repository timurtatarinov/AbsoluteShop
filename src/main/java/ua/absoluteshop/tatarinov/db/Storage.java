package ua.absoluteshop.tatarinov.db;

import ua.absoluteshop.tatarinov.model.User;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    public static final List<User> users = new ArrayList<>();

    static {
        users.add(new User("ttrnvti1@gmail.com", "123"));
        users.add(new User("ttrnvti2@gmail.com", "1234"));
    }

    public static void addUser(User user){
        if (user != null) {
            users.add(user);
        }
    }

    public static List<User> getUsers() {
        return users;
    }

    public static User getUserByEmail(String email){
        // return users.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            String email1 = user.getEmail();
            return user;
        }
        return null;
    }
}