package ru.petrukhin.spring.SpringBootCRUD.service;


import ru.petrukhin.spring.SpringBootCRUD.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
    User getUserById(int id);
}

