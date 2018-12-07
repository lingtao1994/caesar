package edu.northwestern.caesar.services;

import edu.northwestern.caesar.model.Lecture;
import edu.northwestern.caesar.repositories.LectureRepository;
import edu.northwestern.caesar.tools.CurrentSemester;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.List;


/**
 * @author LT
 * @Date on 2018/12/5
 */
@Service
public class LectureServiceImp implements LectureService {

//    private final LectureRepository lectureRepository;
//    private final CurrentSemester currentSemester;
//
//    public LectureServiceImp(LectureRepository lectureRepository, CurrentSemester currentSemester) {
//        this.lectureRepository = lectureRepository;
//        this.currentSemester = currentSemester;
//    }
//
//    public List<Lecture> findByTime(Long semester, Long year){
//
//        return lectureRepository.findAll(new mySpec());
//    }
//
//    private class mySpec implements Specification<Lecture>{
//
//        @Override
//        public Predicate toPredicate(Root<Lecture> root, CriteriaQuery<?> query, CriteriaBuilder cb){
//
//            Path<String> exp1 = root.get("semester");
//            Path<Integer> exp2 = root.get("year");
//
//            Predicate predicate = cb.and(cb.equal(exp1, currentSemester.currentSchoolYear().getSemester()),
//                    cb.equal(exp2, currentSemester.currentSchoolYear().getYear()));
//            return predicate;
//        }
//    }
}
