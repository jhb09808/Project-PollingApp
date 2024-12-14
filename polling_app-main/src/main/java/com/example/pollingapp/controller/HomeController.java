package com.example.pollingapp.controller;

import com.example.pollingapp.service.PollService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
    
    private final PollService pollService;

    public HomeController(PollService pollService) {
        this.pollService = pollService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }


    @GetMapping("/enter-code")
    public String enterCode() {
        return "enter-code";
    }

    @PostMapping("/enter-code")
    public String submitCode(@RequestParam String code, RedirectAttributes redirectAttributes) {
        if (pollService.isPollCodeValid(code)) {
            redirectAttributes.addAttribute("code", code);
            return "redirect:/poll";
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid poll code");
            return "redirect:/enter-code";
        }
    }
}