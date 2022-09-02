package com.sit.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name = "resource_dtls")
public class ResourceEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "RESOURCE_ID")	
	private Integer  resouceId;
	 
	@Column(name = "RESOURCE_NAME")
	private  String resourceName;
	
	@Column(name = "RESOURCE_PROF")
	private String resourceProf;
	
	@Column(name = "RESOURCE_EXP")
	private Integer resourceExp;

	public Integer getResouceId() {
		return resouceId;
	}

	public void setResouceId(Integer resouceId) {
		this.resouceId = resouceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceProf() {
		return resourceProf;
	}

	public void setResourceProf(String resourceProf) {
		this.resourceProf = resourceProf;
	}

	public Integer getResourceExp() {
		return resourceExp;
	}

	public void setResourceExp(Integer resourceExp) {
		this.resourceExp = resourceExp;
	}

	@Override
	public String toString() {
		return "ResourceEntity [resouceId=" + resouceId + ", resourceName=" + resourceName + ", resourceProf="
				+ resourceProf + ", resourceExp=" + resourceExp + "]";
	} 
	
	
	
 
}
