package Birst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
import org.openqa.selenium.support.ui.Select;

public class BirstDemoAutomation {

	public static void main(String[] args) throws Exception {
		String Exp_Result = "Birst: Business Intelligence & Analytics, BI Software";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Desktop\\Selenium Setup\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Birst.Com" + "\n");
		Thread.sleep(3000);
		String ele_text = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).getText();
		System.out.println("The Link text is " + ele_text);
		if (ele_text.equals(Exp_Result)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		boolean disp_logo = driver.findElement(By.xpath("//*[@id='masthead']/div/div[2]/div/a/img")).isDisplayed();
		if (disp_logo == true) {
			System.out.println("Birst Logo is displayed Correctly");
		} else {
			System.out.println("Birst Logo not displayed");
		}

		driver.findElement(By.xpath("//*[@id='menu-item-233']/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id='select2-resource-role-container']"));
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='select2-resource-role-container']"))).click();
		WebElement Filter_Type = driver.findElement(By.xpath("//*[@id='select2-resource-role-container']"));
		Select Filter = new Select(Filter_Type);
		Filter.selectByIndex(9);

	}

}
