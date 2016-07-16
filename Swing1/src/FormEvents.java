import java.util.EventObject;

public class FormEvents extends EventObject{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	private String department;

	public FormEvents(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	public FormEvents(Object arg0, String name , String department) {
		super(arg0);
		this.name = name;
		this.department = department;
	}

	/**
	 * 
	 */
	

}
