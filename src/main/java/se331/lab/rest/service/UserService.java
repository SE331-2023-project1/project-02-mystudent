package se331.lab.rest.service;

import se331.lab.rest.Entity.UserDTO;
import java.util.List;

public interface UserService {

    List<UserDTO> findAllUsers();

    String saveUser(UserDTO userdata);

    String updateUser(UserDTO newUserData);


    UserDTO findById(Integer id);
    
    String deleteUser(UserDTO deleteUserData);

}
