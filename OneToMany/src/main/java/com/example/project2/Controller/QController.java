package com.example.project2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project2.Model.QModel;
import com.example.project2.Repository.QRepo;

@RestController
public class QController {
@Autowired
QRepo rep;
@PostMapping("/posting")
public String adddetails(@RequestBody QModel ques)
{
	rep.save(ques);
	return "saved successfully";
}
}
