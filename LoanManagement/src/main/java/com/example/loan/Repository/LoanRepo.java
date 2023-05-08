package com.example.loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Model.LoanApplicationModel;

public interface LoanRepo extends JpaRepository<LoanApplicationModel, Integer>{

}
