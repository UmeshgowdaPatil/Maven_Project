package gowda99.zMyTestGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
        
	@Test
	public void testG() throws InterruptedException{
		
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setAcceptUntrustedCertificates(true);
//		profile.setAssumeUntrustedCertificateIssuer(false);
//		System.setProperty("webdriver.gecko.driver", ".//webdriver//geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(profile);
//		System.out.println("Firefox Instantiated");
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", ".//webdriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver(capabilities);
		
//		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		System.setProperty("webdriver.ie.driver", ".//webdriver//IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver(capabilities);
		
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("sachin");
		driver.findElement(By.id("_fZl")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
	}
     
}
