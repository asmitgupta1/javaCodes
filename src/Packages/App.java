package Packages;

import Packages.blog.Java;
import Packages.platform.*;
public class App {

	public static void main(String[] args) {
		
		Java obj1 = new Java();
		Packages.platform.Java obj2 =new Packages.platform.Java();
		
		obj1.userFor();
		obj2.userFor();

	}

}
