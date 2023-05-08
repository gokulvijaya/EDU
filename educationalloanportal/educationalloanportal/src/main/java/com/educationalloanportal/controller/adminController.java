package com.educationalloanportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educationalloanportal.model.adminModel;
import com.educationalloanportal.service.loanApplicationService;


@RestController
public class adminController {
@Autowired
loanApplicationService adSer;


	@GetMapping("admin/getAllloans")
	public List<adminModel> getAllLoans()
	{
		
	return adSer.getAllloans();
	}
	
	
}
