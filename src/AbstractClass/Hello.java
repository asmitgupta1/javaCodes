package AbstractClass;



import AbstractClass.person.NonVegan;
import AbstractClass.person.Person;
import AbstractClass.person.Vegan;

public class Hello {

	public static void main(String[] args) {
		
		Person john = new Vegan();
		john.speak();
		john.eat();
		
		Person mia = new NonVegan();
		mia.speak();
		mia.eat();
		
		

	}

}
