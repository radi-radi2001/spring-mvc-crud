package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {


		// add to the spring model
		theModel.addAttribute("employees", employeeService.findAll());

		return "employees/list-employees";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		Employee employee = new Employee();
		model.addAttribute("employee",employee);
		return "employees/employee-from";
	}

	@PostMapping("/save")
	public String saveEmployees(@ModelAttribute("employee") Employee employee){
		//save the employee
		employeeService.save(employee);
		return "redirect:/employees/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFromForUpdate(@RequestParam("employeeId") int theId,Model theModel){
		Employee employee = employeeService.findById(theId);

		theModel.addAttribute("employee",employee);


		return "employees/employee-from";
	}
	@GetMapping ("/delete")
	public String delete(@RequestParam("employeeId") int theId){
		employeeService.deleteById(theId);

		return "redirect:/employees/list";
	}

}









