package com.movie.user.controller;import com.movie.user.entity.User;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.PathVariable;import org.springframework.web.bind.annotation.RestController;import com.movie.user.dao.UserRepository;/** * Created by luyangjian on 2017/10/13. */@RestControllerpublic class UserController {    @Autowired    private UserRepository userRepository;    @GetMapping("/user/{id}")    private User findById(@PathVariable Long id) {        User user = userRepository.findOne(id);        return user;    }}