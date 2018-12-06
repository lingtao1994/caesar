package edu.northwestern.caesar.services;

import edu.northwestern.caesar.model.Lecture;

/**
 * @author LT
 * @Date on 2018/12/5
 */
public interface LectureService {

    Lecture findByTime(Long semester, Long year);
}
