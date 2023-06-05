package com.raquel.Semana08;

import com.raquel.Semana08.enums.Category;
import com.raquel.Semana08.model.Course;
import com.raquel.Semana08.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Semana08Application {

	public static void main(String[] args) {
		SpringApplication.run(Semana08Application.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Spring");
			c.setCategory(Category.BACK_END);

			courseRepository.save(c);
		};
	}

}
