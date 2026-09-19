package com.masterclass.aop.decorator;

public interface StudentService {
    StudentDto createStudent(StudentDto student);
    StudentDto getStudentById(Long id);
}
