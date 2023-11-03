package ninesa.ninesa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NinesaApplication {
	@GetMapping("/hello")
	public String hello() {
		return "no me quiere poner 100? :D";
	}

	public static void main(String[] args) {
		SpringApplication.run(NinesaApplication.class, args);
	}

}