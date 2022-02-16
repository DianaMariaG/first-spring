package ro.fastrackit.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApplication.class, args);
		//sunt in afara spring;
	}


	@Bean
	CommandLineRunner atStartUp(Car car) {
		return args -> {
			System.out.println("Getting my car");
			System.out.println(car);
		};
	}
}


