package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;

@Repository
public interface PersonInfoDao extends JpaRepository<PersonInfo, String> {
    List<PersonInfo> findByAgeGreaterThan(int age);
    
    List<PersonInfo> findByAgeLessThanEqualOrderByAgeAsc(int age);
    
    List<PersonInfo> findByAgeLessThanOrAgeGreaterThan(int lessAge, int greaterAge);
    
    List<PersonInfo> findTop3ByAgeBetweenOrderByAgeDesc(int minAge, int maxAge);
    
    List<PersonInfo> findByCityContaining(String city);
    
    List<PersonInfo> findByAgeGreaterThanAndCityContainingOrderByAgeDesc(int age, String city);
}
