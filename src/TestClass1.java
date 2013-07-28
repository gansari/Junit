import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestClass1 
{
	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new FirefoxDriver();
	}
	
	@After
	public void after()
	{
		driver.quit();
	}
	
@Test  //annotation
public void signup() throws Exception
	{
	
	driver.get("http://www.facebook.com");
	WebElement fname = driver.findElement(By.id("u_0_0"));
	fname.sendKeys("Golam");
	Thread.sleep(500);
	WebElement lname = driver.findElement(By.id("u_0_1"));
	lname.sendKeys("Ansari");
	WebElement emailadd = driver.findElement(By.id("u_0_2"));
	emailadd.sendKeys("ansari1@gansari.net");
	WebElement reemail = driver.findElement(By.id("u_0_3"));
	reemail.sendKeys("ansari1@gansari.net");
	
	//Select month = new Select(driver.findElement(By.id("month")));
	//month.selectByVisibleText("Feb");
	
	WebElement passwd = driver.findElement(By.id("u_0_4"));
	passwd.sendKeys("ansari123456");
	
	new Select(driver.findElement(By.id("month"))).selectByVisibleText("Feb");
	new Select(driver.findElement(By.id("day"))).selectByVisibleText("3");
	new Select(driver.findElement(By.id("year"))).selectByVisibleText("1972");
	
	driver.findElement(By.id("u_0_6")).click();
	driver.findElement(By.id("u_0_7")).click();
	}

@Test  //annotation
public void signout() throws Exception
	{
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("ansari@gansari.net");
	driver.findElement(By.id("pass")).sendKeys("ansari123456");
	driver.findElement(By.id("u_0_b")).click();
	Thread.sleep(500);
	driver.findElement(By.id("navAccountLink")).click();
	driver.findElement(By.xpath("//form[@id='logout_form']//input[@value='Log Out']")).click();
	System.out.println("Sign Out Done");
	
	}

}
