import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegularExpressionPractice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	driver.findElement(By.xpath("//input[@name='login']")).sendKeys("chandan123");
	driver.findElement(By.cssSelector("input#password")).sendKeys("hello");
	driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
}
}
