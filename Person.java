package people;

public class Person {
	protected int age;
	protected String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public Person(int age) {
		this(age, null);
	}
	
	public Person(String name)
	{
		this(0, name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public boolean equals(Person person) {
		return this.age==person.age && this.name.equals(person.name);
//		if(this.age==person.age && this.name.equals(person.name))
//		{
//			return true;
//		}
//		return false;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		Person sam = new Person(24, "Sam");
		Person sam2 = new Person(24, "Sam");
		Person chloe = new Person(19, "Chloe");
		Person chloe2 = chloe;
		
		System.out.println(sam.equals(sam2));
		System.out.println(sam.equals(chloe));
		System.out.println(chloe.equals(chloe2));
		System.out.println(sam.toString() + sam2.toString() + chloe.toString() + chloe2.toString());
		
	}

}
