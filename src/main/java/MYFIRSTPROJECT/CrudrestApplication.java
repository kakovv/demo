package MYFIRSTPROJECT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CrudrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudrestApplication.class, args);
	}

}
