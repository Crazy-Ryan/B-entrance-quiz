package com.thoughtworks.capability.gtb.entrancequiz.repo;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    private List<Student> students = new ArrayList<>();

    public StudentRepo() {
        students.add(new Student("成吉思汗"));
        students.add(new Student("鲁班七号"));
        students.add(new Student("太乙真人"));
        students.add(new Student("钟无艳"));
        students.add(new Student("花木兰"));
        students.add(new Student("雅典娜"));
        students.add(new Student("芈月"));
        students.add(new Student("白起"));
        students.add(new Student("刘禅"));
        students.add(new Student("庄周"));
        students.add(new Student("马超"));
        students.add(new Student("刘备"));
        students.add(new Student("哪吒"));
        students.add(new Student("大乔"));
        students.add(new Student("蔡文姬"));
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public List<Student> getStudents() {
        return students;
    }
}
