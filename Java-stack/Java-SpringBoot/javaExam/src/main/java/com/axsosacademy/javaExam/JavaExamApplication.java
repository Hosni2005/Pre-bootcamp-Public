package com.axsosacademy.javaExam;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"com.axsosacademy", "com.axsosacademy.application"})
public class JavaExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaExamApplication.class, args);
	}

}
