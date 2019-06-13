package com.isoguzay.androidnativedemo.demo1activitytoactivity.model;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String personName;
    private int personAge;
    private boolean personStatus;

    public Person() {
    }

    public Person(int id, String personName, int personAge, boolean personStatus) {
        this.id = id;
        this.personName = personName;
        this.personAge = personAge;
        this.personStatus = personStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public boolean isPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(boolean personStatus) {
        this.personStatus = personStatus;
    }
}
