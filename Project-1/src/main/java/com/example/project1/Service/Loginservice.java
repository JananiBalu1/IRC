package com.example.project1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.Pharmacymodel.Loginmodel;
import com.example.project1.Repository.Loginrepo;

@Service
public class Loginservice {
@Autowired
private Loginrepo repo;
public String checklogin(String name,String password)
{
	Loginmodel user=repo.findByname(name); 
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPassword().equals(password))
		{
			return "Login successful";
		}
		else
		{
			return "Login Failed";
		}
	}
}
public Loginmodel addUser (Loginmodel mod)
{
	return repo.save(mod);
}
public List<Loginmodel>getUser()
{
	return repo.findAll();
}
public String deleteById(int id)
{
	repo.deleteById(id);
	return "Deleted";
}
}
