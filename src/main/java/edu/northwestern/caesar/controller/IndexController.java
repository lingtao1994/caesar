package edu.northwestern.caesar.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LT
 * @Date on 2018/11/30
 */
@Component
public class IndexController {

    @RequestMapping({"", "/", "/login.html"})
    public String login(Model model){

        return "login";
    }
}
