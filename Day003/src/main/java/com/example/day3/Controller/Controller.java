package com.example.day3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day3.model.IPL;
import com.example.day3.service.IPLservice;

@RestController
public class Controller {
@Autowired
public IPLservice iser;
@PostMapping("/saveIPL")
public IPL addDetails (@RequestBody IPL ia)
{
	return iser.saveInfo(ia);
}
}
