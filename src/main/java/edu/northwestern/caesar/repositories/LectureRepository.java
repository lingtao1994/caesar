package edu.northwestern.caesar.repositories;

import edu.northwestern.caesar.model.Lecture;
import org.springframework.data.repository.CrudRepository;

/**
 * @author LT
 * @Date on 2018/12/5
 */
public interface LectureRepository extends CrudRepository<Lecture, Long> {

    Lecture findByTime(Long semester, Long year);
}
