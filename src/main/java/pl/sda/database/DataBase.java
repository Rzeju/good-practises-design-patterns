package pl.sda.database;

import pl.sda.domain.User;

import java.util.HashSet;
import java.util.Set;

public class DataBase {

    private static Set<User> users = new HashSet<>();

    public static Set<User> getUsers() {
        return users;
    }

    static {
        User user1 = new User(1, "User1", "Password1", "user1@sda.pl");
        User user2 = new User(2, "User2", "Password2", "user2@sda.pl");
        User user3 = new User(3, "User3", "Password3", "user3@sda.pl");
        User user4 = new User(4, "User4", "Password4", "user4@sda.pl");
        User user5 = new User(5, "User5", "Password5", "user5@sda.pl");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }
}
