package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by LT on 2018/11/12
 */
@Getter
@Setter
@Entity
public class Transcripts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private int uosCode;
    private String semester;
    private int year;
    private double grade;
}
