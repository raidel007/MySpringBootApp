package io.javabrains.springbootstarter.topic;

public class Topic {
	
	private String description;
	private String tittle;
	private String id; 

	public Topic() {
		
	}
	
	public Topic(String description, String tittle, String id) {
		this.description = description;
		this.tittle = tittle;
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
