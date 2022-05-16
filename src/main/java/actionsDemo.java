import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAiAmrOBBhA0EiwArn3mfBz97ols-Q-h4JJgpk5XmrrVTJyS19MlAkkl7WxCITgHhXUpzP9EBRoClZcQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAiAmrOBBhA0EiwArn3mfBz97ols-Q-h4JJgpk5XmrrVTJyS19MlAkkl7WxCITgHhXUpzP9EBRoClZcQAvD_BwE");
	Actions a=new Actions(driver);
	
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build()
	.perform();
	a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
	}


}
