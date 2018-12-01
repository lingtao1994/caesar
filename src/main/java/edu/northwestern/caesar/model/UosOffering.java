package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by LT on 2018/11/12
 */
@Getter
@Setter
@Entity
public class UosOffering {

    private String uosCode;
    private String semester;
    private int year;
    private String textBook;
    private int enrollment;
    private int maxEnrollment;
    private int instructorId;
}
