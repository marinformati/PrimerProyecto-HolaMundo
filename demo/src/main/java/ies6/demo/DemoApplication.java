package ies6.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication // se usa una importacion para usar el sprint tool
@ComponentScan(basePackages = {"demo","models"}) // Escanea los paquetes que contienen tus clases
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
