package Products;

import Interfaces.Departments;

public class Accounts implements Departments {

	@Override
	public void doSomething() {
		
		System.out.print("Accounts dept");
		
	}

}
