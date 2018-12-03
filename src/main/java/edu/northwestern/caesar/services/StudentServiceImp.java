package edu.northwestern.caesar.services;

import edu.northwestern.caesar.model.Student;
import edu.northwestern.caesar.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LT
 * @Date on 2018/12/2
 */
@Service
public class StudentServiceImp implements StudentService{

    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Set<Student> findAll(){
        Set<Student> students = new HashSet<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

}
