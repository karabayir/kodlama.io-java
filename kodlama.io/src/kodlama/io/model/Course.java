package kodlama.io.model;

public class Course {
	
	private int id;
	private String courseName;
	private double coursePrice;
	
	public Course() {
		
	}

	public Course(int id, String courseName, double coursePrice) {
		this.id = id;
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	

}
