package se331.lab.rest.Service;

import se331.lab.rest.Entity.User;

import java.util.List;

public interface UserService {
    Integer getUserSize();
    List<User> getUsers(Integer pageSize, Integer page);
    User getUser(Long id);
}
