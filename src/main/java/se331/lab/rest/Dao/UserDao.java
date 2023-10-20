package se331.lab.rest.Dao;

import se331.lab.rest.Entity.User;

import java.util.List;

public interface UserDao {
    Integer getUserSize();
    List<User> getUsers(Integer pageSize, Integer page);
    User getUser (Long id);
}
