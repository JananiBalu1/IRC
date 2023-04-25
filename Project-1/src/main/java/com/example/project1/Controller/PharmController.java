package com.example.project1.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Pharmacymodel.Pharmclass;
import com.example.project1.Service.Pharmservice;

@RestController
public class PharmController {
	@Autowired
	public Pharmservice pser;
	@PostMapping("/savepharm")
	public Pharmclass addDetails(@RequestBody Pharmclass pr)
	{
		return pser.saveinfo(pr);
	}
    //Get
	@GetMapping("/savepharm/{id}")
	public Optional<Pharmclass>getdetails(@PathVariable("id")int id)
	{
		return pser.getdetails(id);
	}
	//update
	@PutMapping("/update")
	public Pharmclass updatedetails(@RequestBody Pharmclass id)
	{
		return pser.updatedetails(id);
	}
	//delete
	@DeleteMapping("/savepharm/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		pser.deletedetails(id);
		return "deleted successfully";
	}
}
