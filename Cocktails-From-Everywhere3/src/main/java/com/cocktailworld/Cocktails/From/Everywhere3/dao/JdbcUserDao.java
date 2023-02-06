package com.cocktailworld.Cocktails.From.Everywhere3.dao;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cocktailworld.Cocktails.From.Everywhere3.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class JdbcUserDao implements UserDao{

    private JdbcTemplate jdbcTemplate;

    public JdbcUserDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int findIdByUsername(String username){
        if(username == null) throw  new IllegalArgumentException("Username cannot be null");

        int userId;
        try{
            userId = jdbcTemplate.queryForObject("select user_id from users where username = ?", int.class, username);
        }catch(EmptyResultDataAccessException e){
            throw new UsernameNotFoundException("User " + username + " was not found");
        }
        return userId;
    }

    @Override
    public User getUserById(int userId) {
        String sql = "Select * from users where user_id = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, userId);
        if(results.next()){
            return mapRowToUser(results);
        }else {
            return null;
        }
    }

    @Override
    public User findByUsername(String username) {
        String sql = "Select * from users where username = ?";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, username);
        if(results.next()){
            return mapRowToUser(results);
        }else {
            return null;
        }
    }

    //don't really know where this one should go.
    //maybe for the admin to see all users
    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        String sql = "Select * from users";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()){
            User user = mapRowToUser(results);
            users.add(user);
        }
        return users;
    }

    @Override
    public int create(String username, String password, String role) {
        Integer userId;
        String insertUserSql = "insert into users (username, password_hash, role) values(?,?,?) returning user_id";
        String password_hash = new BCryptPasswordEncoder().encode(password);
        String userRole = role.toUpperCase().startsWith("ROLE_") ? role.toUpperCase() : "ROLE_" + role.toUpperCase();
        try{
            userId = jdbcTemplate.queryForObject(insertUserSql, Integer.class, username, password_hash, userRole);
        } catch(NullPointerException e){
            throw e;
        }
        return userId;
    }

//    public User getuser

    private User mapRowToUser(SqlRowSet rs){
        User user = new User();
        user.setUserId(rs.getInt("user_id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password_hash"));
        user.setRole(rs.getString("role"));
        return user;
    }

}
