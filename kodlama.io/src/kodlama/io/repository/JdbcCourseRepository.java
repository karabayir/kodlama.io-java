package kodlama.io.repository;

import kodlama.io.model.Course;

public class JdbcCourseRepository implements CourseRepository {

	@Override
	public void add(Course select) {
		System.out.println(JdbcMessage.addMessage+select);
		
	}

}
