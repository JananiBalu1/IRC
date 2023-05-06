package com.example.project1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.project1.Pharmacymodel.Pharmclass;

import jakarta.transaction.Transactional;

public interface PharmRepository extends JpaRepository<Pharmclass, Integer> {
Pharmclass findByUsername(String username);
@Query(value="Select * from Pharmacy",nativeQuery=true)
public List<Pharmclass>getAllData();

@Query(value="Select * from Pharmacy where id=:id",nativeQuery=true)
public List<Pharmclass>byitemname(@Param("id")int id);

@Query(value="Select * from Pharmacy where id between ?1 and ?2",nativeQuery=true)
public List<Pharmclass>startEnd(int start,int end);

@Modifying
@Transactional
@Query(value="delete from Pharmacy where id=?1 and itemname=?2",nativeQuery=true)
Integer deleteId(int id,String name);

@Modifying
@Transactional
@Query(value="update Pharmacy set id=:id where itemname=:name",nativeQuery=true)
public void updateByQuery(@Param("id")int id,@Param("name")String name);

@Query("select a from Pharmclass a where itemname=?1")
public List<Pharmclass> getjpqlname(String name);

@Query("select a from Pharmclass a where id between ?1 and ?2")
public List<Pharmclass >getbtw(int strat,int end);

@Modifying
@Transactional
@Query("delete from Pharmclass where id=?1")
public void deletejpqlid(int id);

@Modifying
@Transactional
@Query("update Pharmclass set qty=?1 where id=?2")
public void updatejpql(String a,int b);
}

 