package com.ssmdemo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssmdemo.bean.Student;
import com.ssmdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/stu")
    public String getStudent(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        //引入PageHelper插件,传入页码，以及每页大小
        PageHelper.startPage(pn,5);
        List<Student> students = studentService.getStudentAll();
        //对结果进行封装,参数为封装的数组以及显示的页数
        PageInfo page = new PageInfo(students,5);
        model.addAttribute("pageInfo",page);
        return "list";
    }

    @RequestMapping("/test")
    public void stest(){
        studentService.test();
    }

}
