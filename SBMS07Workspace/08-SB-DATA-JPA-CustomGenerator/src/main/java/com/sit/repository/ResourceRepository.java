package com.sit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<ResourceEntity, Serializable>{

}
