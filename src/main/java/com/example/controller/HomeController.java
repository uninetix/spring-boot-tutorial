package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        String str = "Kadry v0.1";
        mav.addObject("message", str);
        return mav;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("admin/admin");
        String str = "Strona administratorska";
        mav.addObject("message", str);
        return mav;
    }

    @RequestMapping(value = "/model", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("message", "Z czystego Modelu");
        return "hello";
    }
}
