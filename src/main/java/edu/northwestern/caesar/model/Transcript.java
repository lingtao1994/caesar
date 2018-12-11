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

    @Column(name = "uoscode")
    private String uosCode;

    @Column(name = "semester")
    private String semester;

    @Column(name = "classroomid")
    private String classroomId;

    @Column(name = "year")
    private int year;

    @Column(name = "classtime")
    private String classTime;

    @Column(name = "grade")
    private double grade;
}
