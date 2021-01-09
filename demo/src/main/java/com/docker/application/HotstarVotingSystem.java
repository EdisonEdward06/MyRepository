package com.docker.application;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
public class HotstarVotingSystem {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\eddie\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\eddie\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		
		
		
		

       
        
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
        
		
		 WebDriver driver = new FirefoxDriver(options);
        driver.get("https://tamilglitz.in/bigg-boss-tamil-vote/");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        System.out.println("webpage opened");
        
        for(int i= 1 ; i<=10 ; i++) {
        	
        	 JavascriptExecutor executor = (JavascriptExecutor)driver;
        WebElement findCheckBox = driver.findElement(By.name("PDI_answer49500190"));
        
        executor.executeScript("arguments[0].scrollIntoView()", findCheckBox);
        
        findCheckBox.click();
        
        System.out.println("Checkbox clicked for balaji");
        
        Thread.sleep(10000);
        
        WebElement findVoteButton = driver.findElement(By.xpath("//*[@id=\"pd-vote-button10678329\"]"));
        
       // WebElement myelement = driver.findElement(By.id("navigati (JavascriptExecutor)driver;
        
       
        

        executor.executeScript("arguments[0].scrollIntoView()", findVoteButton);
        
        
        
        
        findVoteButton.click();
        
        System.out.println("Vote button clicked ");
        
        Thread.sleep(15000);
      WebElement returnToPollButton =  driver.findElement(By.className("pds-return-poll"));
      
      executor.executeScript("arguments[0].scrollIntoView()", returnToPollButton);
      
      
      returnToPollButton.click();
      
      System.out.println("Return to poll clicked ");
      
        }
        
        driver.close();
		
	
		
		
		    }

}
