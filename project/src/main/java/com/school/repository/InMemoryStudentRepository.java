package com.school.repository;

import com.school.model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {
    private Map<String, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public Student getStudent(String id) {
        return students.get(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    @Override
    public void updateStudent(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public void deleteStudent(String id) {
        students.remove(id);
    }
}