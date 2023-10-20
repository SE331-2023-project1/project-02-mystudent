package se331.lab.rest.Controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import se331.lab.rest.Entity.User;
import org.springframework.stereotype.Controller;
import se331.lab.rest.Service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    final UserService userService;

    @GetMapping("users")
    public ResponseEntity<?> getUserLists(@RequestParam(value = "_limit",
    required = false) Integer perPage
    ,@RequestParam(value = "_page",required = false)Integer page) {
        List<User> output = null;
        Integer userSize = userService.getUserSize();
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count", String.valueOf(userSize));

            try {
                output = userService.getUsers(perPage, page);
                return new ResponseEntity<>(output,responseHeader,HttpStatus.OK);
            } catch (IndexOutOfBoundsException ex){
                return new ResponseEntity<>(output,responseHeader,HttpStatus.OK);
            }
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
//    @PostConstruct
//    public void init() {
//        userList = new ArrayList<>();
//
//    }
}
