//package edu.uark.controllers;
//
//import java.util.UUID;
//
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/employee")
//public class EmployeeRestController
//{
//	@RequestMapping(value = "/apiv0/{employeeId}", method = RequestMethod.GET)
//	public Employee getEmployee(@PathVariable UUID employeeId) {
//		return (new EmployeeQuery()).setEmployeeId(employeeId).execute();
//	}
//
//	@RequestMapping(value = "/apiv0/byLookupCode/{employeeLookupCode}", method = RequestMethod.GET)
//	public Employee getEmployeeByLookupCode(@PathVariable String employeeLookupCode) {
//		return (new EmployeeByLookupCodeQuery()).setLookupCode(employeeLookupCode).execute();
//	}
//
//	@RequestMapping(value = "/apiv0/employees", method = RequestMethod.GET)
//	public EmployeeListing getEmployees() {
//		return (new EmployeesQuery()).execute();
//	}
//
//	@RequestMapping(value = "/apiv0/", method = RequestMethod.PUT)
//	public Employee putActivity(@RequestBody Employee employee) {
//		return (new EmployeeSaveCommand()).setApiEmployee(employee).execute();
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public String test() {
//		return "EMPLOYEE - Things are cool";
//	}
//}
