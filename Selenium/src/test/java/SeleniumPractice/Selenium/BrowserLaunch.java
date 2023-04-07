package SeleniumPractice.Selenium;


import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
public void handlebrowser()
{
//	System.setProperty("webdriver.http.factory", "jdk-http-client");
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuj1\\Desktop\\Eclipse_Workdpace\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	Options op=driver.manage();
	Window w=op.window();
	w.maximize();
}
public static void main(String[] args) 
{
	BrowserLaunch bl=new BrowserLaunch();
	bl.handlebrowser();
}
}
