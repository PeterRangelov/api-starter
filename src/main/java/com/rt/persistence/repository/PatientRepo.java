package com.rt.persistence.repository;

import com.rt.persistence.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {
	
	Patient getPatientById(int id);
}
