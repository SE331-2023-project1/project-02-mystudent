package se331.lab.rest.Service;

import org.springframework.data.domain.Page;
import se331.lab.rest.Entity.User;

import java.util.List;

public interface UserService {
    Integer getUserSize();
    Page<User> getUsers(Integer pageSize, Integer page);
    User getUser(Long id);
    User save(User user);
}
