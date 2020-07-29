package com.fuyi.myblog.controller;

import com.fuyi.myblog.domain.User;
import com.fuyi.myblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /**
     *Author fuyi
     *ClassName UserController
     *Description
     *Param
     *Return
     *Date  2019/7/16 23:04
     */
    @GetMapping
    public ModelAndView list (Model model){
        model.addAttribute("userList",userRepository.findAll());
        model.addAttribute("title","用户管理");
        return new ModelAndView("users/list","userModel",model);
    }
     @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id")String id,Model model) {
        Optional<User> user = userRepository.findById(id);
         model.addAttribute("user",user);
         model.addAttribute("title","查看用户");
         return new ModelAndView("users/view","userModel",model);
    }
    @GetMapping("/form")
    public ModelAndView createForm(Model model) {
        model.addAttribute("user",new User( null,null,null));
        model.addAttribute("title","查看用户");
        return new ModelAndView("users/view","userModel",model);
    }
    @PostMapping
    public ModelAndView saveOrUpdateUser(User user){
        userRepository.save(user);
        return new ModelAndView("redirect:/users");//重定向到list页面
    }
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") String id){
        userRepository.deleteById(id);
        return new ModelAndView("redirect:/users");//重定向到list页面
    }
    @GetMapping("/modify/{id}")
    public ModelAndView modify(@PathVariable("id")String id,Model model){
        Optional<User> user = userRepository.findById(id);
        model.addAttribute("user",user);
        model.addAttribute("title","修改用户");
        return  new ModelAndView("users/form","userModel",model);
    }
}
