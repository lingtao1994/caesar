package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LT on 2018/11/12
 */
@Getter
@Setter
@Entity
@Table(name = "Lectures")
public class Lectures extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "courses_id")
    private Course course;

    @Column(name = "classroomId")
    private String classroomId;

    @Column(name = "year")
    private int year;

    @Column(name = "classTime")
    private String classTime;
}
