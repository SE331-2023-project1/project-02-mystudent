package se331.lab.rest.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab.rest.Dao.UserDao;
import se331.lab.rest.Entity.User;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserDao userDao;
    @Override
    public Integer getUserSize() {
        return userDao.getUserSize();
    }

    @Override
    public Page<User> getUsers(Integer pageSize, Integer page) {
        return userDao.getUsers(pageSize, page);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public Page<User> getUser(String name, Pageable pageable) {
        return userDao.getUser(name,pageable);
    }

    @Override
    public User delete(User user) {
        return null;
    }

}
