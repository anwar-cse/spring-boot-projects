package com.example.sms.service;


import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


private final StudentRepository studentRepository;


public StudentServiceImpl(StudentRepository studentRepository) {
this.studentRepository = studentRepository;
}


@Override
public Student saveStudent(Student student) {
return studentRepository.save(student);
}


@Override
public List<Student> getAllStudents() {
return studentRepository.findAll();
}


@Override
public Student getStudentById(Long id) {
return studentRepository.findById(id)
.orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
}


@Override
public Student updateStudent(Student student, Long id) {
Student existing = getStudentById(id);
existing.setName(student.getName());
existing.setEmail(student.getEmail());
existing.setCourse(student.getCourse());
return studentRepository.save(existing);
}


@Override
public void deleteStudent(Long id) {
studentRepository.deleteById(id);
}
}