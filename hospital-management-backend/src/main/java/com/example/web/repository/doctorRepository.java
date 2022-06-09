package com.example.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.model.doctor;

@Repository
public interface doctorRepository extends JpaRepository<doctor, Long> {


}
