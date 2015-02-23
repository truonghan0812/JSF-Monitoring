package com.truonghan.sitemonitoring.backend.model;

 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

@Entity(name="check1")
public class Check {

	@Id
	@GeneratedValue
	private int id;
	@Size(min=1, message="Name can not be empty!")
	private String name;
	
	@Size(min=1, message="Url can not be empty!")
	@URL(message="Invalid url!")
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
