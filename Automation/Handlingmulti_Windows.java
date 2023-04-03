package codingtask;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handlingmulti_Windows {
	
	static {
		System.setProperty("webdriver.edge.driver", "./Driverfile/msedgedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.get("https://codoid.com/");
		try {
		driver.findElement(By.xpath("//li[@class='linkedin']/a/img")).click();
		driver.findElement(By.xpath("//li[@class='twitter']/a/img")).click();
		driver.findElement(By.xpath("//li[@class='youtube']/a/img")).click();
		driver.findElement(By.xpath("//li[@class='instagram']/a")).click();
		}
		catch(ElementClickInterceptedException e)
		{
			driver.findElement(By.xpath("//li[@class='linkedin']/a/img")).click();
			driver.findElement(By.xpath("//li[@class='twitter']/a/img")).click();
			driver.findElement(By.xpath("//li[@class='youtube']/a/img")).click();
			driver.findElement(By.xpath("//li[@class='instagram']/a")).click();
			
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//li[@class='youtube']/a/img")).click();
		
		}
		Set<String> multiplewns = driver.getWindowHandles();
		for (String singlewn : multiplewns) {
			
			driver.switchTo().window(singlewn);
			System.out.println(driver.getTitle());
			driver.close();
			
		}
		
		
		
	}
	 

}

output:
Microsoft Edge WebDriver was started successfully.
Apr 03, 2023 10:24:54 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 109, so returning the closest version found: 107
Best Software QA Testing Services Company in India
Codoid Innovations - A Software Testing Company - YouTube

Codoid Innovations | LinkedIn
Software & App Testing Company (@codoid.innovations) • Instagram photos and videos

