package people;

public class Student {
	protected int number;
	protected String name;
	protected String email;
	
	public Student(int number, String name) {
		this(number, name, null);   //calls other constuctor but changes email to null
	}
	
	public Student(String name)
	{
		this(0, name, null);
	}

	public Student(int number, String name, String email) {
		this.number = number;
		this.name = name;
		this.email = email;
	}
}
