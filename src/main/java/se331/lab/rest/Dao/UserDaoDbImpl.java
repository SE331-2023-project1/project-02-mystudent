package se331.lab.rest.Dao;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Repository;
import se331.lab.rest.Entity.User;
import se331.lab.rest.Repository.UserRepository;

@Repository
@RequiredArgsConstructor
@Profile("db")
public class UserDaoDbImpl implements UserDao{

    final UserRepository userRepository;
    @Override
    public Integer getUserSize() {
        return Math.toIntExact(userRepository.count());
    }

    @Override
    public Page<User> getUsers(Integer pageSize, Integer page) {
        return userRepository.findAll(PageRequest.of(page - 1, pageSize));
    }

    @Override
    public Page<User> getUser(String name, Pageable page) {
        return userRepository.findByNameContainingIgnoreCaseOrStudentID(name, name, page);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
