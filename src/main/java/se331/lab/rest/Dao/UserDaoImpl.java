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

//    @PostConstruct
//    public void init() {
//        userList = new ArrayList<>();
//        userList.add(User.builder()
//                .id(101L)
//                .username("admin")
//                .password("admin")
//                .name("The")
//                .surname("Admin")
//                .studentID("642115001")
//                .image("https://t4.ftcdn.net/jpg/04/75/00/99/360_F_475009987_zwsk4c77x3cTpcI3W1C1LU4pOSyPKaqi.jpg")
//                .role("admin")
//                .department("CAMT")
//                .build());
//        userList.add(User.builder()
//                .id(102L)
//                .username("admin2")
//                .password("admin2")
//                .name("Joe")
//                .surname("John")
//                .studentID("632115002")
//                .image("https://junkmailimages.blob.core.windows.net/large/fa685acad3d44539bd3d0ffba39c913b.jpg")
//                .role("admin")
//                .department("CAMT")
//                .build());
//    }

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
