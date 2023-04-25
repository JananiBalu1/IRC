package com.example.project1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project1.Pharmacymodel.Pharmclass;

public interface PharmRepository extends JpaRepository<Pharmclass, Integer> {

}
