package com.thoughtworks.capability.gtb.entrancequiz.model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    private List<Student> students = new ArrayList<>();

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public StudentGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addStudentToThisGroup(Student student) {
        students.add(student);
    }

    public List<Student> getStudentsInThisGroup() {
        return students;
    }
}
