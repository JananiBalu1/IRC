package com.example.project1.Controller;

import java.util.List;
import java.util.Map;
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
import com.example.project1.Repository.PharmRepository;
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
		@GetMapping("/sortAsc/{itemname}")
		public List<Pharmclass>sortpharmachy(@PathVariable("itemname")String itemname)
		{
			return pser.sortAsc(itemname);
		}
		@GetMapping("/sortDesc/{itemname}")
		public List<Pharmclass>sortpharmacy(@PathVariable("itemname")String itemname)
		{
			return pser.sortDesc(itemname);
		}
		@GetMapping("/pagination/{pgn}/{pgs}")
		public List<Pharmclass>paginationData(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
		{
			return pser.paginationData(pgn,pgs);
		}
		@GetMapping("/paginationSorting/{pgn}/{pgs}/{itemname}")
		public List<Pharmclass>paginationSorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("itemname")String itemname)
		{
			return pser.paginationAndSorting(pgn,pgs,itemname);
		}
		@Autowired
		public PharmRepository psr;
		@GetMapping("/pharm")
		public List<Pharmclass>getD()
		{
			return psr.getAllData();
		}
		@GetMapping("/byName/{id}")
		public List<Pharmclass>getname(@PathVariable("id")int id)
		{
			return psr.byitemname(id);
		}
		//login
		@PostMapping("/login")
		public String login(@RequestBody Map<String,String>logindata)
		{
			String username=logindata.get("username");
			String password=logindata.get("password");
			String result=pser.checklogin(username,password);
			return result;
		}
	}



