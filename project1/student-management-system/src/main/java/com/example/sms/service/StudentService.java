package com.example.sms.service;


import com.example.sms.entity.Student;
import java.util.List;


public interface StudentService {
Student saveStudent(Student student);
List<Student> getAllStudents();
Student getStudentById(Long id);
Student updateStudent(Student student, Long id);
void deleteStudent(Long id);
}