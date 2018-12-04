package edu.northwestern.caesar.controller;

import edu.northwestern.caesar.services.StudentService;
import org.springframework.stereotype.Controller;

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

