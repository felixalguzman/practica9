package com.tarea.practica9;

import com.tarea.practica9.entidades.NivelEscolar;
import com.tarea.practica9.repositorio.NivelEscolarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        String[] lista = applicationContext.getBeanDefinitionNames();
        System.out.println("====== Beans Registrados =====");
        for(String bean : lista){
            System.out.println(""+bean);
        }
        System.out.println("====== FIN Beans Registrados =====");


		NivelEscolarRepository nivelEscolarRepository = (NivelEscolarRepository) applicationContext.getBean("nivelEscolarRepository");

		if (nivelEscolarRepository.count() <= 0){

            NivelEscolar nivelEscolar = new NivelEscolar();


            nivelEscolar.setNombre("Basico");
            nivelEscolarRepository.save(nivelEscolar);

            nivelEscolar = new NivelEscolar();
            nivelEscolar.setNombre("Medio");
            nivelEscolarRepository.save(nivelEscolar);

            nivelEscolar = new NivelEscolar();
            nivelEscolar.setNombre("Grado Universitario");
            nivelEscolarRepository.save(nivelEscolar);

            nivelEscolar = new NivelEscolar();
            nivelEscolar.setNombre("Postgrado");
            nivelEscolarRepository.save(nivelEscolar);

            nivelEscolar = new NivelEscolar();
            nivelEscolar.setNombre("Doctorado");
            nivelEscolarRepository.save(nivelEscolar);

        }



	}

	
}
