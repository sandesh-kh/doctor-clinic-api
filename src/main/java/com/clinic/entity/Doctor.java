package com.clinic.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String specialization;
    private String contact;

//    // Bi-directional mapping to Appointments
//    @OneToMany(mappedBy = "doctor")
//    private List<Appointment> appointments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

//	public List<Appointment> getAppointments() {
//		return appointments;
//	}
//
//	public void setAppointments(List<Appointment> appointments) {
//		this.appointments = appointments;
//	}
}
