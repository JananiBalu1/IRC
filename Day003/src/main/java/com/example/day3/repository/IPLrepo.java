package com.example.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day3.model.IPL;

@Repository
public interface IPLrepo extends JpaRepository<IPL,Integer> {

}
