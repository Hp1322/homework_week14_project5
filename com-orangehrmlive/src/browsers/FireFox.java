package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //open URL
        driver.get(url);
        //implicit time for driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title
        String titl = driver.getTitle();
        System.out.println("Title = "+titl);

        //Get current URL
        String current = driver.getCurrentUrl();
        System.out.println("Current URL = "+current);

        //Get page source
        String pd = driver.getPageSource();
        System.out.println("Page source = "+pd);

        //Enter email to email field
        WebElement em = driver.findElement(By.id("txtUsername"));
        em.sendKeys("Kan123@mail.com");

        //Enter password to password field
        WebElement pas = driver.findElement(By.name("txtPassword"));
        pas.sendKeys("kpj123@56");

        //Closing driver
        driver.close();

    }
}
