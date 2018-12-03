package edu.northwestern.caesar.controller;

import edu.northwestern.caesar.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author LT
 * @Date on 2018/12/2
 */
@Controller
public class StuInfoController {

    private final StudentService studentService;

    public StuInfoController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping({"/student"})
    public String stuInfo(Model model){

        //model.addAttribute("studentInfo", studentService.findById(id));

        return "student/index";
 }
}
