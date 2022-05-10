package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open Url
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title
        String t = driver.getTitle();
        System.out.println("Title = "+t);
        //Get the Current Url
        String c = driver.getCurrentUrl();
        System.out.println("Current URL = "+c);
        //Get the Page source
        String page = driver.getPageSource();
        System.out.println("Page Source = "+page);

        //Get the email field element
        WebElement emailfield = driver.findElement(By.id("txtUsername"));
        emailfield.sendKeys("Patel2045@hotmail.com");

        //Get the password field element
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Patel20~585");

        //closing driver
        driver.close();

    }
}
