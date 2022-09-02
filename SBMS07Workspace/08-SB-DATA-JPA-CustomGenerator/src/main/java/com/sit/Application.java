package com.sit;

import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sit.repository.ResourceEntity;
import com.sit.repository.ResourceRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		    ResourceRepository resourceRepository = run.getBean(ResourceRepository.class);
		 
		 ResourceEntity resourceEntity = new ResourceEntity();
		 //resourceEntity.setResouceId(301);
		 resourceEntity.setResourceName("AshokRohan");
		 resourceEntity.setResourceProf("Developer");
		 resourceEntity.setResourceExp(8);
		 resourceRepository.save(resourceEntity);
		 
	}

}
