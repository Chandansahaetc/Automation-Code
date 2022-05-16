import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver.exe"); 
WebDriver driver=new ChromeDriver();
driver.get("https://login.salesforce.com/?locale=in");
driver.findElement(By.cssSelector("input[id='username']")).sendKeys("chandan");
driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();	}
//test
}
