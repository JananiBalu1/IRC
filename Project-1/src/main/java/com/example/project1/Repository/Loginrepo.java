package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.Pharmacymodel.Loginmodel;

public interface Loginrepo extends JpaRepository<Loginmodel, Integer>{
	Loginmodel findByname(String name);

}
