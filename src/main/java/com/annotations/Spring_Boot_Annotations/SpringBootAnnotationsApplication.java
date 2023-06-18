package com.annotations.Spring_Boot_Annotations;

import MyPackage.Man;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootAnnotationsApplication implements CommandLineRunner {

	@Autowired
	private Date date;

	@Autowired
	@Qualifier("student2")
	private Student student;

	@Autowired
	private Emp emp;

	@Autowired
	private Man man;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.studying();
		this.emp.whatsYourName();
		this.man.eating();
	}

}
