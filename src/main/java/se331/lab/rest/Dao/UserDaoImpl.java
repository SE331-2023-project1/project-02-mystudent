package se331.lab.rest.Dao;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import se331.lab.rest.Entity.User;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("manual")
public class UserDaoImpl implements UserDao{
    List<User> userList;

    @PostConstruct
    public void init() {
        userList = new ArrayList<>();
        userList.add(User.builder()
                .id(101L)
                .username("admin")
                .name("Shoyo")
                .surname("Hinata")
                .studentID("642115001")
                .build());
        userList.add(User.builder()
                .id(102L)
                .username("teacher")
                .name("Kenma")
                .surname("Kotsume")
                .studentID("642115002")
                .build());
        userList.add(User.builder()
                .id(103L)
                .username("student")
                .build());
        userList.add(User.builder()
                .id(112L)
                .username("guest")
                .build());
        userList.add(User.builder()
                .id(116L)
                .username("abc")
                .build());
        userList.add(User.builder()
                .id(117L)
                .username("def")
                .build());
    }

    @Override
    public Integer getUserSize() {
        return userList.size();
    }

    @Override
    public Page<User> getUsers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? userList.size() : pageSize;
        page = page == null ? 1 : page;
       int firstIndex = (page-1) * pageSize;
       return new PageImpl<User>(userList.subList(firstIndex,firstIndex+pageSize), PageRequest.of(page,pageSize),userList.size());
    }

    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user ->
                user.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public User save(User user) {
        user.setId(userList.get(userList.size()-1).getId()+1);
        userList.add(user);
        return user;
    }

}
