package SeleniumPractice.Selenium;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp_Page 
{
public void Signup() throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Options op=driver.manage();
	Window w=op.window();
	w.maximize();
	WebElement signup=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
	signup.click();
	Thread.sleep(5000);
	WebElement firstname=driver.findElement(By.name("firstname"));
	firstname.sendKeys("Anuj");
	WebElement surname=driver.findElement(By.name("lastname"));
	surname.sendKeys("Singh");
	WebElement email=driver.findElement(By.cssSelector("input[name='reg_email__']"));
	email.sendKeys("akbckj@gmail.com");
	WebElement password=driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
	password.sendKeys("abdabskcjbasc");
	WebElement Signup=driver.findElement(By.cssSelector("button[name='websubmit']"));
	Signup.click();
}
public static void main(String[] args) throws InterruptedException 
{
	SignUp_Page b1=new SignUp_Page();
	b1.Signup();
}
}
