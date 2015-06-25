package imp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hoope {
	public static void main(String[]args)
	{
	   WebDriver d1 = new FirefoxDriver();
	//puts an implicit wait,will wait for 10 seconds before throwing exception
	   d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//launch website
	   d1.navigate().to("http:www.shophive.com/apple/mac?/p=");
	//maximize the browser
	   d1.manage().window().maximize();
	//get the result text based on its xpath
	   String  result= d1.findElement(By.xpath("//div[1]/ol/li/a")).getText();
	   
	//print message
	   System.out.println(" The Result is " + result);
	//close the browser
	  d1.close();
	}

}
