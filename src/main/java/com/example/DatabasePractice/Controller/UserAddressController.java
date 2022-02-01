package com.example.DatabasePractice.Controller;

import com.example.DatabasePractice.Domain.User;
import com.example.DatabasePractice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserAddressController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String input(Model model) {

        model.addAttribute("saveInput", new User());
        model.addAttribute("users", userRepository.findAll());

        return "input";
    }

    @PostMapping("/")
    public String saveInput(User user, Model model) {

        userRepository.save(user);

        model.addAttribute("saveInput", new User());
        model.addAttribute("users", userRepository.findAll());

        return "input";
    }

}
