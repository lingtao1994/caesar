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
@Table(name = "uosofferings")
public class UosOffering extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "courses_id")
    private Course course;

    @Column(name = "year")
    private int year;

    @Column(name = "textBook")
    private String textBook;

    @Column(name = "enrollment")
    private int enrollment;

    @Column(name = "maxEnrollment")
    private int maxEnrollment;

    @Column(name = "instructorId")
    private int instructorId;
}
