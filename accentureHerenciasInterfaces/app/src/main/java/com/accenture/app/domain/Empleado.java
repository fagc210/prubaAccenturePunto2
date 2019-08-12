package com.accenture.app.domain;

import java.time.LocalDate;

public abstract class Empleado {
	
	private String name;
	private String lastName;
	private LocalDate bornDate;
	
	public Empleado() {
	}
	
	public Empleado(String name, String lastName,LocalDate bornDate) {
		this.name = name;
		this.lastName = lastName;
		this.bornDate=bornDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}
	
}
