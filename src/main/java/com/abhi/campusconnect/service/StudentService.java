package com.abhi.campusconnect.service;

import com.abhi.campusconnect.entity.Student;
import com.abhi.campusconnect.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studentrepo;

    public StudentService(StudentRepository studentrepo){
        this.studentrepo=studentrepo;
    }

    public Student saveStudent(Student student){
        return studentrepo.save(student);
    }

    public List<Student> getAllStudents(){
        return studentrepo.findAll();
    }

    public Student getStudentById(Long id){
        return studentrepo.findById(id).orElseThrow(()-> new RuntimeException("Student not found"));
    }

    public Student updateStudent(Long id, Student student){
        Student oldstudent= getStudentById(id);
        oldstudent.setName(student.getName());
        oldstudent.setCourse(student.getCourse());
        oldstudent.setEmail(student.getEmail());
        oldstudent.setAge(student.getAge());

        return studentrepo.save(oldstudent);

    }

    public void deleteStudentById(Long id){
        Student student = getStudentById(id);
    studentrepo.deleteById(id);
    }
}
