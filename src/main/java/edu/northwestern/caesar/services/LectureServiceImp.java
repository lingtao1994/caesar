package edu.northwestern.caesar.services;

import edu.northwestern.caesar.model.Lecture;
import edu.northwestern.caesar.repositories.LectureRepository;
import org.springframework.stereotype.Service;

/**
 * @author LT
 * @Date on 2018/12/5
 */
@Service
public class LectureServiceImp implements LectureService {

    private final LectureRepository lectureRepository;

    public LectureServiceImp(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }

    @Override
    public Lecture findByTime(Long semester, Long year){
        return lectureRepository.findByTime(semester, year);
    }
}
