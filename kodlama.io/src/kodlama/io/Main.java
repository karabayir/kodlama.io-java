package kodlama.io;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.loging.DatabaseLogger;
import kodlama.io.core.loging.FileLogger;
import kodlama.io.core.loging.Logger;
import kodlama.io.core.loging.MailLogger;
import kodlama.io.model.Camp;
import kodlama.io.model.Category;
import kodlama.io.model.Course;
import kodlama.io.model.Educator;
import kodlama.io.repository.HibernateCampRepository;
import kodlama.io.repository.HibernateCategoryRepository;
import kodlama.io.repository.HibernateEducatorRepository;
import kodlama.io.repository.JdbcCampRepository;
import kodlama.io.repository.JdbcCategoryRepository;
import kodlama.io.repository.JdbcCourseRepository;
import kodlama.io.repository.JdbcEducatorRepository;
import kodlama.io.service.CampService;
import kodlama.io.service.CategoryService;
import kodlama.io.service.CourseService;
import kodlama.io.service.EducatorService;

public class Main {

	public static void main(String[] args) throws Exception  {
		
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		
		CategoryService categoryService1 = new CategoryService(new HibernateCategoryRepository(),loggers);
		CategoryService categoryService2 = new CategoryService(new JdbcCategoryRepository(),loggers);
		CourseService courseService1 = new CourseService(new JdbcCourseRepository(),loggers);
		CourseService courseService2 = new CourseService(new JdbcCourseRepository(),loggers);
		EducatorService educatorService1 = new EducatorService(new HibernateEducatorRepository(),loggers);
		EducatorService educatorService2 = new EducatorService(new JdbcEducatorRepository(),loggers);
		CampService campService1 = new CampService(new HibernateCampRepository(),loggers);
		CampService campService2 = new CampService(new JdbcCampRepository(),loggers);
		
		Category category1 = new Category(1, "saat");
		Category category2 = new Category(2, "kulaklık");
		//Category category3 = new Category(3, "saat");
		
		categoryService1.add(category1);
		categoryService2.add(category2);
		//categoryService1.add(category3);
		
		Course course1 = new Course(1, "Java", 100);
		Course course2 = new Course(2,"Javascript", 50);
		//Course course3 = new Course(3, "Java", 150);
		//Course course4 = new Course(4, ".Net", -10);
		
		courseService1.add(course1);
		courseService2.add(course2);
		//courseService1.add(course3);
		//courseService1.add(course4);
		
		Educator educator1 = new Educator(1, "Engin", "Demiroğ");
		
		educatorService1.add(educator1);
		
		Camp camp = new Camp(
				1, 
				"2022 Yazılım Geliştirici Kampı- JAVA", 
				category1.getCategoryName(),
				course1.getCourseName(), 
				educator1.getName()+educator1.getSurname());
				
		campService1.add(camp);
		
	}

}
