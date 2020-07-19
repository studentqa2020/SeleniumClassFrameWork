package com.sanity;

public class TestingException {

	public static void main(String[] args)  {
	
		//  dfdgsdfsdf // error = mistake
		//Thread.sleep(3000);//code is good  but red ==> compile time exception or checked exception
		//solve ==> thows or try catch
		
		
		
		 try {
			System.out.println(2/0);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		 
		 //code is good and no red ==> but got exception after running the code 
		 								//==> runtime exception or unchecked exception
    
		 //solve ==> try catch
		 
		 
		 System.out.println("Have a nice day");
	}

}
