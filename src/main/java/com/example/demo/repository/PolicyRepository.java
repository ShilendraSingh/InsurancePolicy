package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Integer> {

}
