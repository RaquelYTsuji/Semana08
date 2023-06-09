package com.raquel.Semana08;

import com.raquel.Semana08.enums.Category;
import com.raquel.Semana08.model.Course;
import com.raquel.Semana08.model.Lesson;
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

			Lesson l = new Lesson();
			l.setName("Introdução");
			l.setYoutubeUrl("watch?v=1");
			l.setCourse(c);
			c.getLessons().add(l);

			Lesson l1 = new Lesson();
			l1.setName("Angular");
			l1.setYoutubeUrl("watch?v=2");
			l1.setCourse(c);
			c.getLessons().add(l1);

			courseRepository.save(c);
		};
	}

}
