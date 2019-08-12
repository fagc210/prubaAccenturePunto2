package com.accenture.app;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.accenture.app.domain.Analista;
import com.accenture.app.domain.Programador;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AppApplicationTests{
	private static Logger logger = LoggerFactory.getLogger(AppApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info(" ");
		logger.info("mostar resultado para el punto 2 de la prueba");
		LocalDate bornDate = LocalDate.of(1992, Month.NOVEMBER, 11);
		Programador programador = new Programador("Juan", "Perez",bornDate);
		
		logger.info(programador.getName()+" "+programador.getLastName());
		List<String> funtionsList = programador.getFuntions();
		for (String string : funtionsList) {
			logger.info("==> "+string);
		}
		
		Programador programador2 = new Programador();
		programador2.setName("Carlos");
		programador2.setLastName("Arango");
		bornDate = LocalDate.of(1995, Month.JULY, 20);
		programador2.setBornDate(bornDate);
		logger.info(programador2.getName()+" "+programador2.getLastName());
		funtionsList = programador.getFuntions();
		for (String string : funtionsList) {
			logger.info("==> "+string);
		}
		
		Analista analista = new Analista();
		analista.setName("Ana");
		analista.setLastName("Velez");
		bornDate = LocalDate.of(1980, Month.MARCH, 19);
		analista.setBornDate(bornDate);
		logger.info(analista.getName()+" "+analista.getLastName());
		funtionsList = analista.getFuntions();
		for (String string : funtionsList) {
			logger.info("==> "+string);
		}
		
		logger.info("Lista cumpleaños");
		logger.info(programador.getName()+" "+programador.getLastName()+" "+programador.getBornDate());
		logger.info(programador2.getName()+" "+programador2.getLastName()+" "+programador2.getBornDate());
		logger.info(analista.getName()+" "+analista.getLastName()+" "+analista.getBornDate());
		

		
		
	}
	
	
	
	

}
