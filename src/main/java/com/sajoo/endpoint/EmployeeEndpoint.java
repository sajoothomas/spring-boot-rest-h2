package com.sajoo.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.sajoo.rest.vo.EmployeeResponseVo;
import com.sajoo.rest.vo.EmployeeVo;


@Path("/employee")
public class EmployeeEndpoint {
	
	@GET
	@Path("/getemployee")
	@Produces("application/json")
	public EmployeeResponseVo getEmployee(@QueryParam("id") int id, @QueryParam("name") String name){
		
		System.out.println("getEmployee =" + id + " : " + name);
		
		
		
		EmployeeResponseVo response = new EmployeeResponseVo();
		
		List<EmployeeVo> dummyList = new ArrayList<>();
		dummyList.add(new EmployeeVo(111, "suresh", 33));
		dummyList.add(new EmployeeVo(222, "sajoo", 36));
		response.setEmployeeList(dummyList);
		response.setResponseMessage("SUCCESS");
		return response;
		
	}
	

}
