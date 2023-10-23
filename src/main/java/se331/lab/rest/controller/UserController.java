package se331.lab.rest.Controller;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import se331.lab.rest.Entity.User;
import org.springframework.stereotype.Controller;
import se331.lab.rest.Service.UserService;

@Controller
@CrossOrigin(maxAge = 3600)
@RequiredArgsConstructor
public class UserController {
    final UserService userService;

    @GetMapping("users")
    public ResponseEntity<?> getUserLists(@RequestParam(value = "_limit", required = false) Integer perPage
        ,@RequestParam(value = "_page",required = false)Integer page) {
        Page<User> pageOutput = userService.getUsers(perPage, page);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count",
                String.valueOf(pageOutput.getTotalElements()));
        return new ResponseEntity<>(pageOutput.getContent(),responseHeader,HttpStatus.OK);
    }

    @GetMapping("users/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Long id) {
        User output = userService.getUser(id);
        if (output != null){
            return ResponseEntity.ok(output);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The Given id is not found");
        }
    }

//    @GetMapping("student/{studentID}")
//    public ResponseEntity<?> getUserByStudentID(@PathVariable("studentID") String studentID) {
//        User output = userService.getStudentID(studentID);
//        if (output != null){
//            return ResponseEntity.ok(output);
//        }else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The Given id is not found");
//        }
//    }
//    @GetMapping("login")
//    public ResponseEntity<?> logUser(@RequestBody User user) {
//        User output = userService.getUser(user);
//        if (output != null){
//            return ResponseEntity.ok(output);
//        }else {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The Given id is not found");
//        }
//    }

    @PostMapping("/users")
    public ResponseEntity<?> addUser(@RequestBody User user){
        User output = userService.save(user);
        return ResponseEntity.ok(output);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Long id, @RequestBody User updatedUser) {
        User old = userService.getUser(id);
        if (updatedUser.getName() != null){
            old.setName(updatedUser.getName());
        }
        if (updatedUser.getSurname() != null){
            old.setSurname(updatedUser.getSurname());
        }
        if (updatedUser.getImage() != null){
            old.setImage(updatedUser.getImage());
        }
        if (updatedUser.getAdvisorName() != null){
            old.setAdvisorName(updatedUser.getAdvisorName());
        }
        if (updatedUser.getAdvisorSurname() != null){
            old.setAdvisorSurname(updatedUser.getAdvisorSurname());
        }
        if (updatedUser.getAdvisorImage() != null){
            old.setAdvisorImage(updatedUser.getAdvisorImage());
        }
        if (updatedUser.getPosition() != null){
            old.setPosition(updatedUser.getPosition());
        }
        if (updatedUser.getReply() != null){
            old.setReply(updatedUser.getReply());
        }
        if (updatedUser.getComment() != null){
            old.setComment(updatedUser.getComment());
        }

        User output = userService.save(updatedUser);
        return ResponseEntity.ok(output);
    }

//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
//        User userToDelete = userService.getUser(id);
//        userService.deleteUser(userToDelete);
//        return userToDelete;
//    }
}
