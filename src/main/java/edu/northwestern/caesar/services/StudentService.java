package edu.northwestern.caesar.services;

import edu.northwestern.caesar.model.Student;
import edu.northwestern.caesar.repositories.StudentRepository;

/**
 * @author LT
 * @Date on 2018/12/2
 */
public interface StudentService {

    Student findByUserName(String userName);

    Student findById(Long id);

    Student checkPw(String userName, String passWord);

}
