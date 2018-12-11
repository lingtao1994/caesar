package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/**
 * Created by LT on 2018/11/12
 */
@Getter
@Setter
@Entity
@Table(name = "lectures")
public class Lecture extends BaseEntity{
    
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
}
