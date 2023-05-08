package com.example.loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer>{

}
