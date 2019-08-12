package com.accenture.app.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.accenture.app.service.impl.EmpleadoFeature;

public class Analista extends Empleado implements EmpleadoFeature{
	
	public Analista() {
	}

	public Analista(String name, String lastName,LocalDate bornDate) {
		super(name, lastName,bornDate);
	}

	@Override
	public List<String> getFuntions() {
		List<String> funtionsList = new ArrayList<String>();
		funtionsList.add("Realizar Elicitacion de Requerimiento");
		funtionsList.add("Crear Historias de Usuraio");
		return funtionsList;
	}

}
