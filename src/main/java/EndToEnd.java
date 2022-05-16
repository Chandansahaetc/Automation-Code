import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value=\'CCU\']")).click();

		driver.findElement(By.xpath("//a[@value=\'BLR\']")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		// Selection of Adults

		WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

		Select adultsdrp = new Select(Adults);

		adultsdrp.selectByValue("2");

		// Selection of Childs

		WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));

		Select childsdrp = new Select(childs);

		childsdrp.selectByValue("2");

		driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());
	}
}
