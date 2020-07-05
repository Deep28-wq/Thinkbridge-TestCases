package Thinkbridge.phptravels;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void flight() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91963\\Desktop\\java things\\chromedriver_win32 version 81\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("https://www.phptravels.net/home");
      driver.manage().window().maximize();
      
      //selecting flight menu
      driver.findElement(By.xpath("//button[@class='cc-btn cc-dismiss']")).click();
      
      driver.findElement(By.xpath("//a[contains(@class,'text-center flights')]")).click();
      Thread.sleep(1000);
      //selecting round trip
      driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
      
      //selecting business from the dropdown
    //  WebElement drop1 = driver.findElement(By.xpath("//select[@name='cabinclass']"));
      //Select s1 = new Select(drop1);
      //s1.selectByVisibleText("Business");
      
     
      //Actions act = new Actions(driver);
      
       //driver.findElement(By.id("s2id_location_from")).click();
       
       
//     driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]")).sendKeys("pune");
      ///*****Cannot put any value in 'from' and 'TO' field as xpath can't be found properly. It is getting changed. 
      
      
     
      //act.moveToElement(op1).click().moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]")))
      //.sendKeys("pune").keyDown(Keys.ENTER).build().perform();

      
      Thread.sleep(2000);
      //selecting calender
      driver.findElement(By.id("FlightsDateStart")).click();
      driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[2]//div[7]")).click();
      driver.findElement(By.id("FlightsDateEnd")).click();
      driver.findElement(By.xpath("//div[9]//div[1]//div[1]//div[2]//div[11]")).click();
      
      
      //selecting adults,child,infant
      driver.findElement(By.xpath("//div[contains(@class,'row no-gutters mb-15 row-reverse')]//div[contains(@class,'row no-gutters')]//div[1]//div[1]//div[2]//div[1]//span[1]//button[1]")).click();
      driver.findElement(By.xpath("//div[@id='flights']//div[2]//div[1]//div[2]//div[1]//span[1]//button[1]")).click();
      driver.findElement(By.xpath("//div[contains(@class,'col-md-4 col-xs-12')]//div[3]//div[1]//div[2]//div[1]//span[1]//button[1]")).click();
      
      //clicking search button
      driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/button[1]")).click();
      
      
      
      
  }
}
