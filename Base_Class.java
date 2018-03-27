package Day3_session5;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Base_Class {
	
	public Process process;
	public AndroidDriver driver;
	
	public void Start_Server() throws IOException, InterruptedException
	{
		//Start server
		
		String Start_server="D:\\Appium\\node.exe D:\\Appium\\node_modules\\appium\\bin\\appium.js";
		 process = Runtime.getRuntime().exec(Start_server);
		
		if(process != null)
		{
			System.out.println("Started the Appium Server");
		}
		else
		{
			System.out.println("NOT started the Server");
		}
		
		Thread.sleep(12000);		

		
	}
	
	
	public void LaunchApp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capabilities= new DesiredCapabilities();
		
		//device details
		capabilities.setCapability("deviceName","GT-I9300I");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","4.4.4");		
		
		//app details
		capabilities.setCapability("appPackage","com.ebay.mobile");
		capabilities.setCapability("appActivity","com.ebay.mobile.activities.MainActivity");
		
		//Appium Server details
		 driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		//wait
		Thread.sleep(12000);	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	//Stop server
	public void Stop_Server() throws InterruptedException
	{

		//Stop server
		
		if(process !=null)
		{
			process.destroy();
			Thread.sleep(4000);
			
			System.out.println("Stopped the Appium server");
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
