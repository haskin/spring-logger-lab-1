package dev.haskin.springsecuritylab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 * Problems:
 	x For each method in your Spring application, add a `logger.trace()` at the
 		  beginning of the method and a `logger.trace()` call at the end of the method.
	x For each result that you get from an external API, add a `logger.info()` to
 		 	 indicate that you got a result and include one data item from the response
 			  you received.
 */
@SpringBootApplication
public class Springsecuritylab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecuritylab1Application.class, args);
	}

	@Bean
	RestTemplate createRestTemplate() {
		return new RestTemplate();
	}

}
