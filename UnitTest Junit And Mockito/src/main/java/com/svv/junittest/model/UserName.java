package com.svv.junittest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table not need to give @Table hibernate will give the name
public class UserName {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	public UserName() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "UserName")
	private String user;
	@Column(name = "Country")
	private String country;
	@Column(name = "Age")
	private Integer age;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

	public UserName(Long id, String user, String country, Integer age) {
		super();
		this.id = id;
		this.user = user;
		this.country = country;
		this.age = age;
	}
	
}
