package com.testdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@SpringBootApplication
public class SpringBoot2Application {

	public static HashMap<String,Student> hmStudent;

	public static void main(String[] args) {
		hmStudent=new HashMap<String,Student>();

		Student one=new Student("1","John","math");
		hmStudent.put(one.getId(),one);

		SpringApplication.run(SpringBoot2Application.class, args);

		Student two=new Student("2","Jane","history");
		hmStudent.put(two.getId(), two);
	}
}

