package se331.lab.rest.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab.rest.Entity.User;

import java.util.List;

public interface UserService {
    Integer getUserSize();
    Page<User> getUsers(Integer pageSize, Integer page);
    User getUser(Long id);
    User save(User user);
    Page<User> getUser(String name, Pageable pageable);

    User delete(User user);
}
