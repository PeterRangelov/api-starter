package com.rt.controllers;

import com.rt.persistence.entity.Patient;
import com.rt.persistence.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientsController {
	
	@Autowired
	private PatientRepo patientRepo;
	
	
	@GetMapping("/patients/{id}")
	@QueryMapping
	public Patient getPatient(@PathVariable int id) {
		return this.patientRepo.getPatientById(id);
	}
	
}