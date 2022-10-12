package kodlama.io.repository;

import kodlama.io.model.Course;

public class HibernateCourseRepository implements CourseRepository {

	@Override
	public void add(Course select) {
		System.out.println(HibernateMessage.addMessage+select);
		
	}

}
