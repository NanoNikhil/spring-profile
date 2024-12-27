package com.profile.dto;

import java.util.Date;

public class CustomerDto {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String dob;//dd/MM/yyyy
    
    public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDto(int id,String name, String email, String phone, String dob) {
		super();
		this.id=id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.dob = dob;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
    
}