package com.sajoo.rest.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EmployeeResponseVo {
	
	private List<EmployeeVo> employeeList;
	private String responseMessage;
	
	
	public List<EmployeeVo> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<EmployeeVo> employeeList) {
		this.employeeList = employeeList;
	}
	
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	

}
