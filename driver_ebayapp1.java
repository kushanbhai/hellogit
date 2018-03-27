package Day3_session5;

import java.io.IOException;

public class driver_ebayapp1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String Exp_Result="67,833";
		System.out.println("Expected Result is "+Exp_Result);
		
		template_ebay c1= new template_ebay();
		
		c1.Start_Server();
		c1.LaunchApp();
		
		String Actual_Result = c1.Searchitem();	
		System.out.println("Actual Result "+Actual_Result);
		Thread.sleep(2000);
		
		if(Actual_Result.equals(Exp_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		c1.Stop_Server();
		

	}

}
