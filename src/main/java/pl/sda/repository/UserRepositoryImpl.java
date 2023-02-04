package pl.sda.repository;

import pl.sda.database.DataBase;
import pl.sda.domain.User;

import java.util.Set;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public User findById(long id) {
        Set<User> users = DataBase.getUsers();
        for (User user : users) {

            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User add(User user) {
        DataBase.getUsers().add(user);
        return user;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public Set<User> getAll() {
        return null;
    }
}
