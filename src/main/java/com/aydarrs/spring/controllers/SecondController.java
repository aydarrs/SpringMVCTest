package com.aydarrs.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * SecondController.
 *
 * @author Aydar_Safiullin
 */
@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exit() {
        return "second/exit";
    }
}
