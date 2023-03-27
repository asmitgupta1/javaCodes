package Exception_Handling_User_defined;

import java.io.FileNotFoundException;

class UserDefinedException extends Exception{
}
public class App {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("catch block of main method(FileNotFoundException)"); 
		} catch (UserDefinedException e){
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("catch block of main method (Exception)");
		}

	}

	public static void someMethod() throws Exception,FileNotFoundException, UserDefinedException {
		int x = 3;

		switch (x) {
		case 1:
			throw new FileNotFoundException();
		
		case 2:
			throw new Exception();
			default:
				throw new UserDefinedException();
		}

	}
}


