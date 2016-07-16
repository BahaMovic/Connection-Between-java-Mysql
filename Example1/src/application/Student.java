package application;

public class Student {
	private String name ;
	private int id;
	private String major;
	
	public Student(){}
	public Student(String name , int id , String major){
		this.name = name;
		this.id = id;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	

}
