package com.testdev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value="/rest/student")
public class StudentService{

    @RequestMapping(value="/all",method = RequestMethod.GET)
    public HashMap<String,Student> getAllStudents(){
        return SpringBoot2Application.hmStudent;
    }

    @RequestMapping(value="/id", method=RequestMethod.GET)
    public Student getStudentById(@RequestParam("key") String id){
        System.out.println("Id = " + id);
        return SpringBoot2Application.hmStudent.get(id);
    }
}