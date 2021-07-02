package Tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMySql {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("JDBC Driver loaded");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/raghu", "root", "root");
		System.out.println("Connected to Mysql");
		// You can use the Statement Object to send
		
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("Select * from rs");
		rs.next();
		for (int i = 1; i <= 2; i++) {
		String un = rs.getString(1);
		String pwd = rs.getString(2);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rm21174\\Desktop\\Files\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("login_button")).click();
		driver.close();
		rs.next();
		}
		}
		

	

}
