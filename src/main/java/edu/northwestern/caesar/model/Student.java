package edu.northwestern.caesar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by LT on 2018/11/12
 */
@Setter
@Getter
@Entity
@Table(name = "students")
public class Student extends BaseEntity{


    @Column(name = "userName")
    private String userName;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "address")
    private String address;

}
