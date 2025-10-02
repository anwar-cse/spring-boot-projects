package com.example.sms.controller;


import com.example.sms.entity.Student;
import com.example.sms.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController {


private final StudentService studentService;


public StudentController(StudentService studentService) {
this.studentService = studentService;
}


@PostMapping
public ResponseEntity<Student> createStudent(@RequestBody Student student) {
Student saved = studentService.saveStudent(student);
return ResponseEntity.ok(saved);
}


@GetMapping
public ResponseEntity<List<Student>> getAllStudents() {
return ResponseEntity.ok(studentService.getAllStudents());
}


@GetMapping("/{id}")
public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
return ResponseEntity.ok(studentService.getStudentById(id));
}


@PutMapping("/{id}")
public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Long id) {
return ResponseEntity.ok(studentService.updateStudent(student, id));
}


@DeleteMapping("/{id}")
public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
studentService.deleteStudent(id);
return ResponseEntity.ok("Student deleted successfully");
}
}