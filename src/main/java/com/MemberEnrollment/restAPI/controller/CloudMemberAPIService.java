package com.MemberEnrollment.restAPI.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MemberEnrollment.restAPI.model.CloudMember;

@RestController
@RequestMapping("/CloudMember")

public class CloudMemberAPIService {
	
	CloudMember cloudmember;
	
	@GetMapping("{memberid}")
	public CloudMember getCloudmemberdetails(String memberId)
	{
		return cloudmember;
				//CloudMember("m1", "Goutham", "Menneni", "gouthamtech@gmail.com");
	}
	@PostMapping
	public String createCloudMemberDetails(@RequestBody CloudMember cloudmember)
	
	{
		this.cloudmember = cloudmember;
		return "Cloud member created successfully";
	   	
	}
	@PutMapping
public String updateCloudMemberDetails(@RequestBody CloudMember cloudmember)
	
	{
		this.cloudmember = cloudmember;
		return "Cloud member updated successfully";
	   	
	}
	@DeleteMapping("{memberid}")
public String deleteCloudMemberDetails(String memberid )
	
	{
		this.cloudmember = null;
		return "Cloud member deleted successfully";
	   	
	}
	
	
	
	
	
	
	
	

}
