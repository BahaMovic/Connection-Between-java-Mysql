package Model;

public class Person {
	private String name ;
	private String Age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	
	public void print(){
		System.out.println("Name : "+name+" Age : "+Age);
	}

}
