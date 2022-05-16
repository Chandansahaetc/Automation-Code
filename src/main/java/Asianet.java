import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asianet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.asianetnews.com/");
		WebElement headerdriver = driver.findElement(By.className("nav navbar-nav main-menu"));
		System.out.println(headerdriver.findElements(By.tagName("a")).size());
		for (int i = 1; i < headerdriver.findElements(By.tagName("a")).size(); i++) {
			String openInNewtab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			driver.findElements(By.tagName("a")).get(i).sendKeys(openInNewtab);
			Thread.sleep(2000);

			// print the title of the tabs opened
			System.out.println(driver.getTitle());

		}
	}

}
