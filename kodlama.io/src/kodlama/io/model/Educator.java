package kodlama.io.model;

public class Educator {
	
	private int id;
	private String name;
	private String surname;
	
	
	
	public Educator() {
		
	}

	public Educator(int id, String name, String surname) {
		
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	

}
