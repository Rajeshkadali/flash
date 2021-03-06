package com.cg.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cms.entities.Customer;
import com.cg.cms.service.CustomerService;
 
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
    private CustomerService service;
	@GetMapping("/{name}")
	@ApiOperation("Greetings API")
	  public String greetings(@PathVariable String name)
	  {
		  return "<h1>Welcome to Spring" + name + "</h1>";
	  }
	
	@GetMapping("/getByid/{id}")
	@ApiOperation("Get the customer id")
	 public Customer fetchById(@PathVariable String id)
	 {
		return service.fetchById(Integer.valueOf(id));
	 }
	@GetMapping("/getAll")
	@ApiOperation("Fetch all the customer details")
	public List<Customer> fetch()
	{
		return service.fetchAll();
	}
	@PostMapping("/save")
	public void save(@RequestBody Customer customer)
	{
		service.addCustomer(customer);
	}
	@PutMapping("/update")
	public void update(@RequestBody Customer customer)
	{
		service.updateCustomer(customer);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id)
	{
		service.delCustomer(Integer.valueOf(id));
	}
	
}
