package se331.lab.rest.Dao;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import se331.lab.rest.Entity.User;

import java.util.List;

@Repository
@Profile("manual")
public class UserDaoImpl implements UserDao{
    List<User> userList;

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

//    @Override
//    public User getUserByStudentID(String studentID) {
//        return userList.stream().filter(user ->
//                user.getStudentID().equals(studentID)).findFirst().orElse(null);
//    }
}
