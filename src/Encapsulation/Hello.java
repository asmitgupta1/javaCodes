package Encapsulation;

public class Hello {

	public static void main(String[] args) {
	
//		Person person = new Person();
//		
//		System.out.println(person);
		
		Person pooja = new Person("Person",26,"Female");
		
		System.out.println(pooja);
		pooja.setAge(-50);
		System.out.println(pooja);
		
		

	}

}
