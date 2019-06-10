
public class AccessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person firstPerson = new Person();
		Person secondPerson = new Person("Neal", 15, 72, 110, "Indian", "12/5/2003");
		System.out.println(firstPerson.getAge());
		System.out.println(secondPerson.getAge());
		System.out.println(firstPerson.speak());
		System.out.println(secondPerson.speak());
		System.out.println(secondPerson.speak("how you doing"));
		
		firstPerson.setAge(13);
		System.out.println(firstPerson.getAge());

	}

}
