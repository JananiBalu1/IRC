package com.example.project1.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project1.Pharmacymodel.Pharmclass;
import com.example.project1.Repository.PharmRepository;


@Service
public class Pharmservice {
	@Autowired
	public PharmRepository prepo;
	public Pharmclass saveinfo(Pharmclass p)
	{
		return prepo.save(p);
	}
	public Optional<Pharmclass> getdetails(int id) {
		// TODO Auto-generated method stub
		return prepo.findById(id);
	}
	public Pharmclass updatedetails(Pharmclass id) {
		// TODO Auto-generated method stub
		return prepo.saveAndFlush(id);
	}
	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		prepo.deleteById(id);;
	}

}
