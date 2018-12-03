package edu.northwestern.caesar.controller;

import edu.northwestern.caesar.model.Student;
import edu.northwestern.caesar.repositories.StudentRepository;
import edu.northwestern.caesar.services.StudentService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LT
 * @Date on 2018/12/2
 */
@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @RequestMapping({"/student"})
//    public String stuInfo(Model model){
//
//        model.addAttribute("studentInfo", studentService.findAll());
//
//        return "student/index";
//    }


}

