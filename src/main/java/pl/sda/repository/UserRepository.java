package pl.sda.repository;

import pl.sda.domain.User;

import java.util.Set;

public interface UserRepository {

    User findById(long id);

    User add(User user);

    void deleteById(long id);

    void delete(User user);

    Set<User> getAll();
}
