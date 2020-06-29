package demo;

import demo.User;

import java.util.List;

public interface UserRepository {
    List<User> findAllUsers();
    void addUser(User user);
}
