package com.example.day4.carservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4.model.class1;
import com.example.day4.repository.CarRepository;

@Service
public class Carservice {
@Autowired
public CarRepository crepo;
public class1 saveinfo(class1 c)
{
return crepo.save(c);	
}
}
