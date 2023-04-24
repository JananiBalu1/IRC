package com.example.day4.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day4.carservice.Carservice;
import com.example.day4.model.class1;

@RestController
public class CarController {
@Autowired
public Carservice cser;
@PostMapping("/saveCars")
public class1 addDetails(@RequestBody class1 cr)
{
	return cser.saveinfo(cr);
}
}
