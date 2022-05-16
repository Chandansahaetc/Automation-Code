import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// Give me the count of links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// count for footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(coloumndriver.findElements(By.tagName("a")).size());
				//click on each link and check whether it redirecting to desired page or not
				for(int i=1; i<coloumndriver.findElements(By.tagName("a")).size(); i++)
						{
					String openInNewtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(openInNewtab);
				Thread.sleep(2000);
				
			//print the title of the tabs opened
				System.out.println(driver.getTitle());
				
						}
	}

}
