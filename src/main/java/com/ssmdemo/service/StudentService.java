package com.ssmdemo.service;

import com.ssmdemo.bean.Student;
import com.ssmdemo.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;
    public List<Student> getStudentAll(){
        return studentMapper.selectByExampleWithTeacher(null);
    }

    public void test(){
        Student student = new Student();
        student.setStName("wqda");
        studentMapper.insert(student);
        System.out.println("id"+student.getStId());
    }
}
