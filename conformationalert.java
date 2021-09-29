package Assignment.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformationalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
		Alert conformalert = driver.switchTo().alert();
		System.out.println(conformalert.getText());
		//conformalert.accept();
		conformalert.dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		driver.close();

	}

}
