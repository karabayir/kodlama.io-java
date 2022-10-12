package kodlama.io.service;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.loging.Logger;
import kodlama.io.model.Course;
import kodlama.io.repository.CourseRepository;

public class CourseService implements MainService<Course> {
	
	private List<String> courseNameList=new ArrayList<>();
	
	private CourseRepository courseRepository;
	private List<Logger> loggers;

	public CourseService(CourseRepository courseRepository, List<Logger> loggers) {
		this.courseRepository = courseRepository;
		this.loggers = loggers;
	}

	@Override
	public void add(Course from) throws Exception {
		
		if(courseNameList.contains(from.getCourseName().toUpperCase()))
			throw new Exception("Kurs ismi tekrar edemez");
		
		if(from.getCoursePrice() < 0)
			throw new Exception("Bu kursun fiyatı 0 dan küçük olamaz");
		
		courseNameList.add(from.getCourseName().toUpperCase());
		
		courseRepository.add(from);
		
		for (Logger logger : loggers) {
			logger.log(from.getCourseName());
		}
		
	}




	
}
