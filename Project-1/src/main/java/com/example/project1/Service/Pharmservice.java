package com.example.project1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public List<Pharmclass> sortAsc(String itemname) {
		// TODO Auto-generated method stub
		return prepo.findAll(Sort.by(itemname).ascending());
	}
	public List<Pharmclass>paginationData(int pgn,int pgs){
		Page<Pharmclass>p=prepo.findAll(PageRequest.of(pgn, pgs));
		return p.getContent();
	}
	public List<Pharmclass> paginationAndSorting(int pgn, int pgs, String itemname) {
		// TODO Auto-generated method stub
		Page<Pharmclass>p=prepo.findAll(PageRequest.of(pgn, pgs));
		return p.getContent();
	}
	public String checklogin(String username, String password) {
		// TODO Auto-generated method stub
		Pharmclass user=prepo.findByUsername(username);
		if(user==null)
		{
			return "NO User Found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return"Login successfull";
			}
			else
			{
				return"Login failed";
			}
		}
	}
	public List<Pharmclass> sortDesc(String itemname) {
		// TODO Auto-generated method stub
		return prepo.findAll(Sort.by(itemname).descending());
		
	}
}
