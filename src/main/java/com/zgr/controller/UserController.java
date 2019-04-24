package com.zgr.controller;

import com.zgr.domain.User;
import com.zgr.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/showname",method= RequestMethod.GET)
    public String getUserById (@RequestParam("uid") int id,
                               Model model) {
        if (id > 0) {
            User user = userService.getUserById(id);
            model.addAttribute("name", user.getName());
            return "user/info";
        }
        return "user/error";
    }
}
