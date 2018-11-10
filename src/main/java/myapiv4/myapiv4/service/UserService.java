package myapiv4.myapiv4.service;

import myapiv4.myapiv4.entities.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    List<User> getAllUser();
}