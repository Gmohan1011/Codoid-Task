package codingtask;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DataDrivenfromExcel {
	static {
		System.setProperty("webdriver.edge.driver", "./Driverfile/msedgedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver=new EdgeDriver();
		
		FileInputStream fin=new FileInputStream("./data/credential.xlsx");
		Workbook wb= WorkbookFactory.create(fin);
		
		String username = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
                boolean logo = driver.findElement(By.id("logo_aT")).isDisplayed();
		String title = driver.getTitle();
		System.out.println(logo+"-------------"+title);
                driver.close();
		
		
		
	}

}
output:
Microsoft Edge WebDriver was started successfully.
Apr 03, 2023 10:45:39 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 109, so returning the closest version found: 107
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...

true-------------actiTIME - Enter Time-Track
