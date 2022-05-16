import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.get("https://www.facebook.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.close(); //it closes current browser
		//driver.quit(); //it closes all the browser opens by the selenium
		driver.findElement(By.id("email")).sendKeys("saha.chandanetc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("chandan1991");
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	
		//driver.get("https://login.salesforce.com/?locale=in");
		//driver.findElement(By.cssSelector("#username")).sendKeys("TestUser");
		

}
}