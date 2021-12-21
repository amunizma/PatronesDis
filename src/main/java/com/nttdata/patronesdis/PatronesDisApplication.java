package com.nttdata.patronesdis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.patronesdis.singleton.Persona;

@SpringBootApplication
public class PatronesDisApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDisApplication.class, args);
		
		/** SINGLETON */
		Persona instaciaPersona = Persona.getPersona("Pedro");
		System.out.println("Singleton Object :" + instaciaPersona.getNombre());
		
		/** PROTOTYPE */
		
	}

}
