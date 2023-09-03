package web.dao;


import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    void create(User user);
    User read(Long id);
    void update(User user);
    User delete(Long id);
}
