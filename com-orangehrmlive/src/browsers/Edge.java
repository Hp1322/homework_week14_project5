package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String url1 = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver dr = new EdgeDriver();
        //Open URL
        dr.get(url1);
        //Maximize
        dr.manage().window().maximize();
        //Implicit time for driver
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title
        String tl = dr.getTitle();
        System.out.println("Title = "+tl);

        //Get the current URL
        String cur = dr.getCurrentUrl();
        System.out.println("Current URL = "+cur);

        //Get the page source
        String sor = dr.getPageSource();
        System.out.println("Page source = "+sor);

        //Find email field element
        WebElement mail = dr.findElement(By.name("txtUsername"));
        mail.sendKeys("Kanam123@mail.com");

        //Find password field element
        WebElement pas = dr.findElement(By.name("txtPassword"));
        pas.sendKeys("123@562kakm");

        //Closing driver
        dr.close();
    }
}
