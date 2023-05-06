package com.example.project1.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Pharmacymodel.Loginmodel;
import com.example.project1.Service.Loginservice;

@RestController
@RequestMapping("/run")
public class Logincontroller {
	@Autowired
	private Loginservice service;
	
	  @PostMapping("/login")
	  public String login(@RequestBody Map<String, String> loginData) {
	    String name = loginData.get("name");
	    String password = loginData.get("password");
	    String result = service.checklogin(name, password);
	    return result;
	  }
	  @PostMapping("/adduser")
	  	public Loginmodel AddUser(@RequestBody Loginmodel log) {
		  return service.addUser(log);
	  }
      @GetMapping
      public List<Loginmodel>listAll()
      {
    	  return service.getUser();
      }
      @DeleteMapping("/delete/{id}")
      public String delete(@PathVariable int id)
      {
    	  return service.deleteById(id);
      }
}
