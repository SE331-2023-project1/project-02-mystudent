package se331.lab.rest.controller;

import se331.lab.rest.Entity.UserDTO;
import se331.lab.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserServices userServices;
}

 @GetMapping("/all")
    public List<UserDTO> allUsers() {
        return userServices.findAllUsers();
    }


    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO userdata) {
        return userServices.saveUser(userdata);

    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO newUserData) {
        return userServices.updateUser(newUserData);
    }

    @GetMapping("/find/{id}")
    public UserDTO getUserById(@PathVariable Integer id) {
        return userServices.findById(id);
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody UserDTO deleteUserData){
        return userServices.deleteUser(deleteUserData);
    }