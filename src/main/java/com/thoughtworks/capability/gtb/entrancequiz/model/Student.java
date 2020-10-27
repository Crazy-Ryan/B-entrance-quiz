package com.thoughtworks.capability.gtb.entrancequiz.model;

public class Student {
    private int id;
    private String name;

    static int idCounter = 1;

    public Student(String name) {
        this.id = idCounter;
        idCounter++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
