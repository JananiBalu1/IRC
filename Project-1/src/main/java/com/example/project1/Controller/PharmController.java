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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController

public class PharmController {
	@Autowired
	public Pharmservice pser;
	@Tag(name="Posting",description="Posting the given details")
	@PostMapping("/savepharm")
	public Pharmclass addDetails(@RequestBody Pharmclass pr)
	{
		return pser.saveinfo(pr);
	}
    //Get
	
	@Tag(name="Get details",description="To get the required details")
	@GetMapping("/savepharm/{id}")
	public Optional<Pharmclass>getdetails(@PathVariable("id")int id)
	{
		return pser.getdetails(id);
	}
	//update
	@Tag(name="updating",description="To update the details")
	@PutMapping("/update")
	public Pharmclass updatedetails(@RequestBody Pharmclass id)
	{
		return pser.updatedetails(id);
	}
	//delete
	
	@Tag(name="Deleting",description="To delete the details")
	@DeleteMapping("/savepharm/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		pser.deletedetails(id);
		return "deleted successfully";
	}
	
	@Tag(name="Get details",description="To get the required details")
		@GetMapping("/sortAsc/{itemname}")
		public List<Pharmclass>sortpharmachy(@PathVariable("itemname")String itemname)
		{
			return pser.sortAsc(itemname);
		}
	@Tag(name="Get details",description="To get the required details")
		@GetMapping("/sortDesc/{itemname}")
		public List<Pharmclass>sortpharmacy(@PathVariable("itemname")String itemname)
		{
			return pser.sortDesc(itemname);
		}
	
	@Tag(name="Get details",description="To get the required details")
		@GetMapping("/pagination/{pgn}/{pgs}")
		public List<Pharmclass>paginationData(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs)
		{
			return pser.paginationData(pgn,pgs);
		}
	
	@Tag(name="Get details",description="To get the required details")
		@GetMapping("/paginationSorting/{pgn}/{pgs}/{itemname}")
		public List<Pharmclass>paginationSorting(@PathVariable("pgn")int pgn,@PathVariable("pgs")int pgs,@PathVariable("itemname")String itemname)
		{
			return pser.paginationAndSorting(pgn,pgs,itemname);
		}
		@Autowired
		public PharmRepository psr;
		
		@Tag(name="Get details",description="To get the required details")
		@GetMapping("/pharm")
		public List<Pharmclass>getD()
		{
			return psr.getAllData();
		}
		
		@Tag(name="Get details",description="To get the required details")
		@GetMapping("/byName/{id}")
		public List<Pharmclass>getname(@PathVariable("id")int id)
		{
			return psr.byitemname(id);
		}
		//login
		@Tag(name="Posting",description="Posting the given details")
		@PostMapping("/login")
		public String login(@RequestBody Map<String,String>logindata)
		{
			String username=logindata.get("username");
			String password=logindata.get("password");
			String result=pser.checklogin(username,password);
			return result;
		}
		
		@Tag(name="Get details",description="To get the required details")
		@GetMapping("/startend/{start}/{end}")
		public List<Pharmclass>statendId(@PathVariable("start")int start,@PathVariable("end")int end)
		{
			return psr.startEnd(start,end);
		}
		
		@Tag(name="Deleting",description="To delete the details") 
		@DeleteMapping("/deletebyid/{id}/{name}")
		public String deletePerson(@PathVariable("id")int id,@PathVariable("name")String name)
		{
			psr.deleteId(id,name);
			return "deleted";
		}
		
		@Tag(name="updating",description="To update the details")
		@PutMapping("/updatequery/{id}/{name}")
		public void updateByQuery (@PathVariable("id")int id ,@PathVariable("name")String name)
		{
			psr.updateByQuery(id, name);
		}
		
		@Tag(name="Get details",description="To get the required details")
		@GetMapping("/jpqlget/{name}")
		public List<Pharmclass>getdetailname(@PathVariable("name")String name)
		{
			return psr.getjpqlname(name);
		}
		 
		@Tag(name="Get details",description="To get the required details")
		@GetMapping("/getbtw/{start}/{end}")
		public List<Pharmclass>getbtw(@PathVariable("start")int start,@PathVariable("end")int end)	
		{
			return psr.getbtw(start,end);
		}
		
		@Tag(name="Deleting",description="To delete the details")
		@DeleteMapping("/deletejpql/{id}")
		public String deletejpqlid(@PathVariable("id")int id)
		{
			psr.deletejpqlid(id);
			return "Deleted successfully using JPQL Query !";
		}
		@Tag(name="updating",description="To update the details")
		public void updatejpql(@PathVariable("a")String a,@PathVariable("b")int b)
		{
			psr.updatejpql(a,b);
		}
		}



