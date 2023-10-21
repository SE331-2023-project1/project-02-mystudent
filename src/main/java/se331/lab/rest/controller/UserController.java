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

    @PostMapping("/users")
    public ResponseEntity<?> addUser(@RequestBody User user){
        User output = userService.save(user);
        return ResponseEntity.ok(output);
    }
}
