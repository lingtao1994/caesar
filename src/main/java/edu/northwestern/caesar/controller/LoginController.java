package edu.northwestern.caesar.controller;

import edu.northwestern.caesar.model.Student;
import edu.northwestern.caesar.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author LT
 * @Date on 2018/11/30
 */
@Controller
public class LoginController {

    private final StudentService studentService;

    public LoginController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping({"", "/", "/login"})
    public String showLogIn(Model model){

        model.addAttribute("student", new Student());

        return "login";
    }



    @GetMapping
    public String logIn(@Valid Student student){

        Student stu = studentService.checkPw(student.getUserName(), student.getPassword());

        if(stu == null){
            return "login";
        }else{
            return "redirect:/students" + stu.getId();
        }

    }

}
