package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by LT on 2018/11/12
 */
@Getter
@Setter
@Table(name = "transcripts")
public class Transcript {


    @OneToOne
    private Student student;


    @OneToOne
    private Lecture lecture;

    @Column(name = "grade")
    private double grade;
}
