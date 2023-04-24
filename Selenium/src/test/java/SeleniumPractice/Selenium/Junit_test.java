package SeleniumPractice.Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Junit_test 
{
	ChromeDriver driver=new ChromeDriver();

/////////////////////////////////////////////////////////////////
	
	@Before
	public void b()
	{
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();	
	}
	
////////////////////////////////////////////////////////////////
	
	@Test
	public void test() throws InterruptedException
	{
		//signup click
		WebElement signup=driver.findElement(By.xpath("(//a[contains(@id,'u_')])"));
		signup.click();
		Thread.sleep(5000);
		
		WebElement fn=driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("Ankit");
		WebElement ln=driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.sendKeys("Sinha");
		WebElement ea=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		ea.sendKeys("asinha@popmail.com");
		WebElement confirm_mail=driver.findElement(By.xpath("(//input[contains(@id,'u_')])[4]"));
		confirm_mail.sendKeys("asinha@popmail.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pwd.sendKeys("abcdefg");
		
		//selecting DOB
		WebElement drop=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s=new Select(drop);
		s.selectByValue("30");
		WebElement drop1=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(drop1);
		s1.selectByVisibleText("Jun");
		WebElement drop2=driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2=new Select(drop2);
		s2.selectByValue("1995");
		
		WebElement sex=driver.findElement(By.xpath("//label[text()='Male']"));
		sex.click();
		WebElement submit=driver.findElement(By.xpath("(//button[contains(@id,'u_')])[2]"));
		submit.click();
	}
	
////////////////////////////////////////////////////////////////
		
		@After
		public void a()
		{
			driver.close();
		}
}


