package se331.lab.rest.Dao;

import se331.lab.rest.Entity.User;

import org.springframework.data.domain.Page;

public interface UserDao {
    Integer getUserSize();
    Page<User> getUsers(Integer pageSize, Integer page);
    User getUser (Long id);
    User save(User user);
}
