package com.example.project2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project2.Model.AModel;

public interface ARepo extends JpaRepository<AModel,Integer>{

}
