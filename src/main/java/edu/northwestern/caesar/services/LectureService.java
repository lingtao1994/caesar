package edu.northwestern.caesar.services;

import edu.northwestern.caesar.model.Lecture;

import java.util.List;

/**
 * @author LT
 * @Date on 2018/12/5
 */
public interface LectureService {

    List<Lecture> findByTime(Long semester, Long year);

}
