package rivas.hiram.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import rivas.hiram.app.conf.SecurityConfiguration;

@SpringBootApplication
@Import(SecurityConfiguration.class)
public class AlquilerAutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlquilerAutosApplication.class, args);
	}

}
