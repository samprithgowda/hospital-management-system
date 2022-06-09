package com.example.web.model;

import java.util.HashSet;
import java.util.Set;
import  com.example.web.model.patient;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctors")
public class doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long docid;
    @Column(name = "name")
	private String name;
    @Column(name = "gender")
	private String gender;
    @Column(name = "specialist")
	private String specialist;
    @OneToMany
    private Set<patient> patient = new HashSet<>();
    
	public doctor() {
		super();
	}
	public doctor(String name, String gender, String specialist, Set<patient> patient) {
		super();
		this.name = name;
		this.gender = gender;
		this.specialist = specialist;
		this.patient = patient;
	}
	public long getDocid() {
		return docid;
	}
	public void setDocid(long docid) {
		this.docid = docid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public Set<patient> getPatient() {
		return patient;
	}
	public void setPatient(Set<patient> patient) {
		this.patient = patient;
	}

	
	
	
}
