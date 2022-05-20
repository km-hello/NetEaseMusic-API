package com.hello.neteasemusic.controller;

import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.*;
import com.hello.neteasemusic.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    private BannerService bannerService;
    @Autowired
    private UserService userService;

    @GetMapping("/banner")
    public List<Banner> getBanner(){
        return bannerService.getBanner();
    }


    @GetMapping("/login")
    public User login(@RequestParam String phone,@RequestParam String password){
        User user = userService.login(phone,password);
        if(user!=null){
            user.setSuccess(true);
        }
        return user;
    }

    @GetMapping("/user/page")
    public PageInfo<User> getUserPage(@RequestParam String name, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "2") int pageSize){
        return userService.getUserPage(name,pageNum,pageSize);
    }

    @GetMapping("/user/phone")
    public User getUserDetailByPhone(@RequestParam String phone){
        return userService.getUserDetailByPhone(phone);
    }

    @PostMapping("/user")
    public boolean insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @PutMapping("/user")
    public boolean updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user")
    public boolean deleteUser(@RequestParam String phone){
        return userService.deleteUser(phone);
    }
}
