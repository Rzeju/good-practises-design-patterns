package pl.sda;

import pl.sda.database.DataBase;
import pl.sda.domain.User;
import pl.sda.repository.UserRepository;
import pl.sda.repository.UserRepositoryImpl;

public class Main {

    public static void main(String[] args) {

        System.out.println(DataBase.getUsers());

        UserRepository userRepository = new UserRepositoryImpl();
        User user1 = userRepository.findById(4);
        User user2 = userRepository.findById(10);

        System.out.println(user1);
        System.out.println(user2);

        userRepository.delete(user1);

        System.out.println(userRepository.getAll());


    }

}
