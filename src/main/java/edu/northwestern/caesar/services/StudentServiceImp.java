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

    @Override
    public Student findById(Long id){

        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student findByUserName(String userName) {
        return studentRepository.findByuserName(userName);
    }

    @Override
    public Student checkPw(String userName, String passWord){

        Student stu = findByUserName(userName);

        if(passWord == stu.getPassword()){
            return stu;
        }else{
            return null;
        }

    }


}
