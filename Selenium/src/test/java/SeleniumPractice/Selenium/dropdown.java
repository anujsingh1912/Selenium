package SeleniumPractice.Selenium;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{
public void dd() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Options op=driver.manage();
	Window w=op.window();
	w.maximize();
	WebElement create=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
	create.click();
	Thread.sleep(5000);
	WebElement first=driver.findElement(By.name("firstname"));
	first.sendKeys("Anuj");
	WebElement surname=driver.findElement(By.name("lastname"));
	surname.sendKeys("Singh");
	WebElement email=driver.findElement(By.cssSelector("input[name='reg_email__']"));
	email.sendKeys("anuj1912@gmail.com");
	WebElement pwd=driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
	pwd.sendKeys("password");
	WebElement drop=driver.findElement(By.id("day"));
	Select s=new Select(drop);
	s.selectByIndex(19);
	WebElement drop1=driver.findElement(By.id("month"));
	Select s1=new Select(drop1);
	s1.selectByVisibleText("Feb");
	WebElement drop2=driver.findElement(By.id("year"));
	Select s2=new Select(drop2);
	s2.selectByValue("2000");
	WebElement drop3=driver.findElement(By.name("websubmit"));
	drop3.click();
}
public static void main(String[] args) throws InterruptedException 
{
	dropdown b1=new dropdown();
	b1.dd();
}
}

