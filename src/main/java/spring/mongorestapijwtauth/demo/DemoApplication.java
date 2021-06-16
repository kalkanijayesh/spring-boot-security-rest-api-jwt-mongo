package spring.mongorestapijwtauth.demo;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import spring.mongorestapijwtauth.demo.entities.AppUser;
import spring.mongorestapijwtauth.demo.entities.Gender;
import spring.mongorestapijwtauth.demo.repositories.AppUserRepository;
import spring.mongorestapijwtauth.demo.services.AppUserService;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
// @EnableMongoRepositories("spring.mongorestapijwtauth.repositories")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @Bean
	// public CommandLineRunner runner(AppUserService service, MongoTemplate
	// mongoTemplate) {
	// return args -> {
	// System.out.println("It is called !!!!!!");

	// AppUser appUser = new AppUser("Jayesh Kalkani", true, 4, Gender.MALE,
	// List.of("Cricket", "Playing Music", "Swimming"), LocalDateTime.now());

	// // Check user_full_name exist -> if exist -> throw an error or insert the
	// // record.
	// final String name = "Jayesh Kalkani";

	// Optional<AppUser> appUserOptional = service.getAppUserByUname(name);

	// appUserOptional.ifPresentOrElse(s -> System.out.println("Duplicate"), () -> {
	// System.out.println("Inserting User " + appUser);
	// service.insertAppUser(appUser);
	// });

	// };
	// }

}
