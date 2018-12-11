package edu.northwestern.caesar.tools;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Calendar;


/**
 * @author LT
 * @Date on 2018/12/6
 */

@Component
@Getter
@Setter
public class CurrentSemester {

    private String semester;
    private int year;


    public CurrentSemester currentSchoolYear(){

        Calendar current = Calendar.getInstance();
        int year = current.get(Calendar.YEAR);
        int month = current.get(Calendar.MONTH);
        //transfer month to semester//
        if (month >= 9 && month <= 12) {
            semester = "Q1";
        } else if (month >= 1 && month <= 3) {
            semester = "Q2";
        } else if (month >= 4 && month <= 6) {
            semester = "Q3";
        } else {
            semester = "Q4";
        }

        CurrentSemester currentTime = new CurrentSemester();
        currentTime.setSemester(semester);
        currentTime.setYear(year);

        return currentTime;
    }
}
