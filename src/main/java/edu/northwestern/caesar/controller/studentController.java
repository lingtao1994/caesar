package edu.northwestern.caesar.controller;

import edu.northwestern.caesar.model.Student;
import edu.northwestern.caesar.repositories.StudentRepository;
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
public class studentController {

    private final StudentRepository studentRepository;

    public studentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @RequestMapping({"/student"})
    public String stuInfo(Model model){

        model.addAttribute("studentInfo", studentRepository.findAll());

        return "student/index";
    }

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String password) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Student n = new Student();
        n.setName(name);
        n.setPassword(password);
        studentRepository.save(n);
        return "Saved";
    }
}
