
public class Person {
	
	//Fields aka instance variables
	//Think: adjectives
	public String name;
	private int age;
	private int height; // height in inches
	private double weight; //weight in pounds
	private String nationality;
	private String birthday;
	
	//Constructor
	Person() {
		name = "";
		age = 0;
		height = 0;
		weight = 0;
		nationality = "";
		birthday = "";
	}
	
	//Overloaded constructor
	Person(String name, int age, int height, double weight, String nationality, String birthday) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.birthday = birthday;
		this.nationality = nationality;
		
	}
	
	//Getters and Setters
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//Methods or Functions
	//Think: verbs
	String speak() {
		return "Hello, brah, my name is " + this.name;
	}
	
	String speak(String phrase) {
		return "Hello, " + phrase + ", my name is " + name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person firstPerson = new Person();
//		Person secondPerson = new Person("Neal", 15, 72, 110, "Indian", "12/5/2003");
//		System.out.println(firstPerson.age);
//		System.out.println(secondPerson.age);
//		System.out.println(firstPerson.speak());
//		System.out.println(secondPerson.speak());
//		System.out.println(secondPerson.speak("how you doing"));
	}

}
