package pe.com.red.sis.red_sis;

import org.springframework.boot.SpringApplication;

public class TestRedSisApplication {

	public static void main(String[] args) {
		SpringApplication.from(RedSisApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
