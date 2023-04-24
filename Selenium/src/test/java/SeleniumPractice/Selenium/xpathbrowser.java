package SeleniumPractice.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpathbrowser 
{
	public void handlebrowser() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		WebElement signup=driver.findElement(By.xpath("//a[text()='Create new account']"));
		signup.click();
		Thread.sleep(5000);
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Rahul");
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Sharma");
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("rahuls101@mol.com");
		WebElement mail=driver.findElement(By.xpath("(//input[contains(@id,'u_')])[4]"));
		mail.sendKeys("rahuls101@mol.com");
		WebElement pass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		pass.sendKeys("kdffefefef");
		WebElement drop=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(drop);
		s.selectByIndex(19);
		WebElement drop1=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(drop1);
		s1.selectByVisibleText("Mar");
		WebElement drop2=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(drop2);
		s2.selectByValue("1999");
		WebElement sex=driver.findElement(By.xpath("(//input[contains(@id,'u_')])[7]"));
		sex.click();
		WebElement submit=driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		xpathbrowser b1=new xpathbrowser();
		b1.handlebrowser();
	}
}
