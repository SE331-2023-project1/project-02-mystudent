package se331.lab.rest.Dao;

import org.springframework.data.domain.Pageable;
import se331.lab.rest.Entity.User;

import org.springframework.data.domain.Page;

public interface UserDao {
    Integer getUserSize();
    Page<User> getUsers(Integer pageSize, Integer page);
    User getUser (Long id);
//    Page<User> getStudentID(String studentID, Pageable page);
    User save(User user);
}
