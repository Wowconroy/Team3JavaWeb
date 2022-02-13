package org.teamwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.teamwork.model.User;
import org.teamwork.services.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allUsers() {
        List<User> users = userService.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("users");
        modelAndView.addObject("usersList", users);
        return modelAndView;
    }

//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addPage(@ModelAttribute("message") String message) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public ModelAndView addUser(@ModelAttribute("user") User user) {
//        ModelAndView modelAndView = new ModelAndView();
//        userService.create(user);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
//    public ModelAndView editPage(@PathVariable("id") Long id,
//                                 @ModelAttribute("message") String message) {
//        User user = userService.getById(id);
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editPage");
//        modelAndView.addObject("user", user);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public ModelAndView editFilm(@ModelAttribute("user") User user) {
//        ModelAndView modelAndView = new ModelAndView();
//        userService.update(user);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//    public ModelAndView deleteUser(@PathVariable("id") Long id) {
//        ModelAndView modelAndView = new ModelAndView();
//        User user = userService.getById(id);
//        userService.delete(user);
//        return modelAndView;
//    }
}