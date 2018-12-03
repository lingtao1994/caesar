package edu.northwestern.caesar.repositories;

import edu.northwestern.caesar.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * @author LT
 * @Date on 2018/12/2
 */
public interface StudentRepository extends CrudRepository<Student, Long> {

    Student findByuserName(String userName);
}
