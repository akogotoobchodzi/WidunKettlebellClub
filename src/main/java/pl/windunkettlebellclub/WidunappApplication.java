package pl.windunkettlebellclub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootApplication
@WebAppConfiguration
public class WidunappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WidunappApplication.class, args);
	}
}
