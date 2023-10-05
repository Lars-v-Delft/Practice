package com.springboot_practice.restfulwebservice.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get")
    public User getById(@RequestParam(value = "id") int id) {
        User user = userService.getById(id);
        return user;
    }

    @PostMapping("/create")
    public void create(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "custom") String custom) {
        userService.create(name, custom);
    }

    @GetMapping("/getall")
    public List<User> getAll(){
        return userService.getAll();
    }
}
