package se331.lab.rest.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se331.lab.rest.Dao.UserDao;
import se331.lab.rest.Entity.User;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserDao userDao;
    @Override
    public Integer getUserSize() {
        return userDao.getUserSize();
    }

    @Override
    public List<User> getUsers(Integer pageSize, Integer page) {
        return userDao.getUsers(pageSize, page);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
