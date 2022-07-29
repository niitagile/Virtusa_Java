package com.virtusa.beans;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController 
{
	@Autowired
	private UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retriveAllUsers()
	{
		return service.findAll();
	}
	
	
	//retrieves a specific user detail
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id)
	{
		return service.findOne(id);
	}
	
	
	//method that posts a new user detail 
	@PostMapping("/users")
	public void createUser(@RequestBody User user)
	{
		service.save(user);	
	}
	
	@DeleteMapping("/users/{id}")  
	public void deleteUser(@PathVariable int id)  
	{  
		service.deleteById(id);  
	}
	
	@PutMapping(path="/update")
	public @ResponseBody String updateUser(@RequestBody User user) {
	    service.update(user);
	    return "Updated"; 
	   }
	}