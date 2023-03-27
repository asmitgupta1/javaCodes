package static_elements;

import static_elements.testrun.Test_Static;

public class App {

	public static void main(String[] args) {
		
		System.out.println(Test_Static.getStatic_variable());
		Test_Static.setStatic_variable(1);
		System.out.println(Test_Static.getStatic_variable());
		
		
		System.out.println(Test_Static.getStatic_variable());
		Test_Static.setStatic_variable(24);
		System.out.println(Test_Static.getStatic_variable());
		
		System.out.println(Test_Static.getStatic_variable());
		
		

	}

}
