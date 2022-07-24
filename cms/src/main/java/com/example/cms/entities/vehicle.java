package com.example.cms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class vehicle {
	
	@Id
	public String registration_no;
	public String name;
	public String chasis_no;
	public String engine_no;
	public String insurance_validity;
	
	public vehicle(String registration_no, String name, String chasis_no, String engine_no, String insurance_validity) {
		super();
		this.registration_no = registration_no;
		this.name = name;
		this.chasis_no = chasis_no;
		this.engine_no = engine_no;
		this.insurance_validity = insurance_validity;
	}

	public vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChasis_no() {
		return chasis_no;
	}

	public void setChasis_no(String chasis_no) {
		this.chasis_no = chasis_no;
	}

	public String getEngine_no() {
		return engine_no;
	}

	public void setEngine_no(String engine_no) {
		this.engine_no = engine_no;
	}

	public String getInsurance_validity() {
		return insurance_validity;
	}

	public void setInsurance_validity(String insurance_validity) {
		this.insurance_validity = insurance_validity;
	}

	@Override
	public String toString() {
		return "vehicle [registration_no=" + registration_no + ", name=" + name + ", chasis_no=" + chasis_no
				+ ", engine_no=" + engine_no + ", insurance_validity=" + insurance_validity + "]";
	}
	
}


