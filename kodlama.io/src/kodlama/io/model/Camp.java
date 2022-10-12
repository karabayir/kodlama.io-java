package kodlama.io.model;

public class Camp {
	
	private int id;
	private String campName;
	
    private String categoryName;
    private String courseName;
    private String educatorName;
    
    
	public Camp() {

	}


	public Camp(int id, String campName, String categoryName, String courseName, String educatorName) {
		this.id = id;
		this.campName = campName;
		this.categoryName = categoryName;
		this.courseName = courseName;
		this.educatorName = educatorName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCampName() {
		return campName;
	}


	public void setCampName(String campName) {
		this.campName = campName;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getEducatorName() {
		return educatorName;
	}


	public void setEducatorName(String educatorName) {
		this.educatorName = educatorName;
	}
    
    
    

}
