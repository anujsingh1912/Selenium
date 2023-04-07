package SeleniumPractice.Selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Css 
{
public void handlebrowser() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Options op=driver.manage();
	Window w=op.window();
	w.maximize();
	WebElement emailadd=driver.findElement(By.cssSelector("input#email"));
	emailadd.sendKeys("Anuj1912@gmail.com");
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("anuj");
	WebElement login=driver.findElement(By.name("login"));
	login.click();
}
public static void main(String[] args) throws InterruptedException 
{
	Locator_Css b1=new Locator_Css();
	b1.handlebrowser();
}	
}

