package com.spring.springDemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springDemo.entity.Customer;
import com.spring.springDemo.service.CustomerService;

@RestController
public class CustomerRestController {

private CustomerService customerService;
@GetMapping("/customers")
public List<Customer> getCustomers(){
	return customerService.getCustomers();
}
@GetMapping("/customers/{customerId}")
public Customer getCustomer(@PathVariable int customerId) {
	Customer customer=customerService.getCustomer(customerId);
	if(customer==null)
		throw new CustomerNotFoundException("Customer Id not Found:"+customerId);
}
	return customer;
}
@PostMapping("/customers")
public Customer addCustomer(@RequestBody Customer customer) {
	customer.setId(0);
	customerService.saveCustomer(customer);
	return customer;
}
@PutMapping("/customers")
public Customer updateCustomer(@RequestBody Customer customer) {
	
	customerService.saveCustomer(customer);
	return customer;
}
@DeleteMapping("/customers/{customerId}")
public String deleteCustomer(@PathVariable int customerId) {
	customerService.deleteCustomer(customerId);
	return "Delete Customer Id:"+customerId;
}
