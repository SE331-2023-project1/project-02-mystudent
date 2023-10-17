package se331.lab.rest.service;

import se331.lab.rest.Entity.UserDTO;
import se331.lab.rest.repository.UserRepository;
import se331.lab.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserDTO> findAllUsers() {

     List<UserDTO> allusers = userRepository.findAll();
    return allusers;

    }

    @Override
    public String saveUser(UserDTO userdata) {
        userRepository.save(userdata);
        return "data saved";
    }

    @Override
    public String updateUser(UserDTO newUserData) {
        String msg=null;
        if (newUserData.getId()!= null){
    userRepository.save(newUserData);
    msg="Data updated";
    }
       else{
       msg="Error";}

       return msg;
    }

    @Override
    public UserDTO findById(Integer id) {
        return userRepository.getOne(id);
    }
    
    @Override
    public String deleteUser(UserDTO deleteUserData)
    {
       userRepository.delete(deleteUserData);
       return "data deleted";
    }
}
