package com.Victor.Man;

/**
 * Created by Victor on 01.10.2016.
 */
public class Student {
    private int yearOfStudy;

    Student(int y){
        yearOfStudy = y;
    }

    public void addOneYearOfStudy() {
        yearOfStudy =+ 1;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }


}
