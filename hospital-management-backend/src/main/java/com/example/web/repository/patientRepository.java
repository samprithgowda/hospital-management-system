package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.model.patient;

public interface patientRepository extends JpaRepository<patient, Long> {

}
