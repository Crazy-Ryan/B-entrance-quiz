package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Student;
import com.thoughtworks.capability.gtb.entrancequiz.model.StudentGroup;
import com.thoughtworks.capability.gtb.entrancequiz.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StudentService {
    private final StudentRepo studentRepo = new StudentRepo();

    public List<Student> getAllStudents() {
        return studentRepo.getStudents();
    }

    public List<StudentGroup> groupAllStudentsRandomly(int numberOfGroups) {
        List<StudentGroup> studentGroups = new ArrayList<>();
        for(int index = 0; index < numberOfGroups; index++){
            studentGroups.add(new StudentGroup((index+1) +" "+"组"));
        }
        ArrayList<Student> allStudents = (ArrayList<Student>) this.getAllStudents();
        List<Student> studentPoll = (ArrayList<Student>) allStudents.clone();
        Random random = new Random();
        int currentGroupIndex = 0;
        while (studentPoll.size() > 0) {
            studentGroups.get(currentGroupIndex).addStudentToThisGroup(studentPoll.remove(random.nextInt(studentPoll.size())));
            currentGroupIndex ++;
            if (currentGroupIndex == numberOfGroups) {
                currentGroupIndex = 0;
            }
        }
        return studentGroups;
    }


}
