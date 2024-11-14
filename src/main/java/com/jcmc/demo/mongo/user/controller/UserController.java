package com.jcmc.demo.mongo.user.controller;

import com.jcmc.demo.mongo.user.model.User;
import com.jcmc.demo.mongo.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> save(@Valid @RequestBody User user){
        return new ResponseEntity<>(userService.saveOrUpdate(user), HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> update(@Valid @RequestBody User user){
        return new ResponseEntity<>(userService.saveOrUpdate(user), HttpStatus.ACCEPTED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> findAll(){
        return new ResponseEntity<>(userService.findAll(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@Valid @RequestBody User employee){
        userService.delete(employee);
        return new ResponseEntity<>("Record deleted", HttpStatus.ACCEPTED);
    }

}
