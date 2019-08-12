package com.accenture.app.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.accenture.app.service.impl.EmpleadoFeature;

public class Programador extends Empleado implements EmpleadoFeature{

	public Programador() {
	}
	
	public Programador(String name, String lastName,LocalDate bornDate) {
		super(name, lastName, bornDate);
	}

	@Override
	public List<String> getFuntions() {
		List<String> funtionsList = new ArrayList<String>();
		funtionsList.add("Codificar las historias de usuario");
		funtionsList.add("hacer pruebas unitarias");
		return funtionsList;
	}




}
