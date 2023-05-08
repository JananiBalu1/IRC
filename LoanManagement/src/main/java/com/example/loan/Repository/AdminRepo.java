package com.example.loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Model.Adminmodel;

public interface AdminRepo extends JpaRepository<Adminmodel, Integer> {

}
