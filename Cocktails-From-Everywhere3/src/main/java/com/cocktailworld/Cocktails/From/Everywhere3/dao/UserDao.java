package com.cocktailworld.Cocktails.From.Everywhere3.dao;
import com.cocktailworld.Cocktails.From.Everywhere3.model.User;

import java.util.List;

public interface UserDao {
    int findIdByUsername(String username);

    User getUserById(int userId);
    User findByUsername(String username);
    List<User> findAll();
    int create(String username, String password, String role);
}
