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
public class Student {
    private int id;
    private String name;
    private String password;
    private String address;
}
