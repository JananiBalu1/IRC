package com.example.loan.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loan.LoanService.LoanService;
import com.example.loan.Model.LoanApplicationModel;
import com.example.loan.Model.UserModel;

@RestController
@RequestMapping("/user")
public class LoanController {
	 @Autowired

	 public LoanService lser;
	 @GetMapping("/ad")
	    public Optional<UserModel> readbyid(@PathVariable("id")int id)
	    {
	     return lser.getUsermodelbyId(id);
	    }
	 @PostMapping("/id")
	    public UserModel create(@RequestBody UserModel id)
	    {
	     return lser.adduser(id);
	    }
	  @PutMapping("/id")
	     public UserModel update(@RequestBody UserModel id)
	     {
	      return lser.update(id);
	     }

	          @DeleteMapping("/delet")

	     public String delete(@PathVariable("id")int id)

	     {

	      lser.delete(id);
	      return "Deletion was successful";

	     }
	       @PostMapping("/lid")

	          public LoanApplicationModel create(@RequestBody LoanApplicationModel loanId)

	          {

	           return lser.adduser(loanId);

	          }

	        @PutMapping("/lid")

	           public LoanApplicationModel update(@RequestBody LoanApplicationModel loanId)

	           {

	            return lser.update(loanId);

	           }

	            @DeleteMapping("/delete")

	           public String delete1(@PathVariable("loanId")int loanId)

	           {

	            lser.delete(loanId);

	            return "Deletion was successful";

	           }
	            @GetMapping("/ladd")
	            public Optional<LoanApplicationModel> readbyid1(@PathVariable("loanId")int loanId)

	            {

	             return lser.getLoanApplicationbyId(loanId);

	            }
	}



