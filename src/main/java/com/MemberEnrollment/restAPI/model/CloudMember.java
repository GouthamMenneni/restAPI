package com.MemberEnrollment.restAPI.model;


public class CloudMember 
{
	
	private String memberid;
	private String firstName;
	private String lastName;
	private String email;
	
	
	public CloudMember() {
		
	}

	public CloudMember(String memberid, String firstName, String lastName, String email) {
		super();
		this.memberid = memberid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
	}

	public String getId() {
		return memberid;
	}
	public void setId(String id) {
		this.memberid = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
