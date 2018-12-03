package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by LT on 2018/11/12
 */
@Getter
@Setter
@Entity
@Table(name = "transcripts")
public class Transcript extends BaseEntity {


    @OneToOne
    private Student student;


    @OneToOne
    private Lecture lecture;

    @Column(name = "grade")
    private double grade;
}
