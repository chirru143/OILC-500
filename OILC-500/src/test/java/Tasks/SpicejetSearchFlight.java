package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetSearchFlight {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rm21174\\Desktop\\Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Hyderabad (HYD)");
	
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//		Select drpstate = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
//		drpstate.selectByVisibleText("Hyderabad (HYD)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).sendKeys("Goa (GOI)");
		
//		Select drpstate1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")));
//		drpstate1.selectByVisibleText("Jaipur (JAI)");
		Thread.sleep(3000);
//        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//        driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[3]/li[7]/a")).sendKeys("goa");
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).sendKeys("4");
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).sendKeys("INR");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
