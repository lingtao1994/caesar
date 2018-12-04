package edu.northwestern.caesar.services;

import edu.northwestern.caesar.model.Student;
import edu.northwestern.caesar.repositories.StudentRepository;
import org.springframework.stereotype.Service;

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
    public Student checkPw(String userName, String password){

        Student stu = findByUserName(userName);

        System.out.println("step 1");

        if(stu == null) {
            System.out.println("stu == null");
            return null;
        } else if (password.equals(stu.getPassword())) {
            System.out.println("password match");
            return stu;
        }else{
            System.out.println("password not match");
            return null;
        }

    }

    @Override
    public Student save(Student student){

        return studentRepository.save(student);
    }


}
