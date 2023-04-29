package com.example.project1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project1.Pharmacymodel.Pharmclass;

public interface PharmRepository extends JpaRepository<Pharmclass, Integer> {
Pharmclass findByUsername(String username);
@Query(value="Select * from Pharmacy",nativeQuery=true)
public List<Pharmclass>getAllData();

@Query(value="Select * from Pharmacy where id=:id",nativeQuery=true)
public List<Pharmclass>byitemname(@Param("id")int id);

}
