package com.example.loan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loan.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer>{

}
