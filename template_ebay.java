package Day3_session5;

public class template_ebay extends Base_Class {
	
	
	
	public String Searchitem() throws InterruptedException
	{
		driver.findElementById("com.ebay.mobile:id/search_box").click();
		Thread.sleep(2000);
		driver.findElementById("com.ebay.mobile:id/search_src_text").sendKeys("Shoes" +"\n");
		
		Thread.sleep(15000);
		
		String Output = driver.findElementById("com.ebay.mobile:id/textview_item_count").getText();
		//System.out.println("Output is  "+Output);
		
		//String Actual_Result = Output.replace(" results", "");
		
		String Actual_Result = Output.split(" ")[0];		
		
		return 	Actual_Result;
		
	}

}
