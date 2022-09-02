package com.sit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sit.dao.StudentDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		StudentDao bean = run.getBean(StudentDao.class);
		bean.insertStudent(12, "Sojan", "abc.a@d.com", 23);
	}

}
