package comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class ComHerokuapp {
    public static void main(String[] args) throws InterruptedException {
        //set up Chrome browser
        String baseUrl =  "http://the-internet.herokuapp.com/login";
        WebDriver driver = new ChromeDriver();
        //open URL
        driver.get(" http://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print title page
        String title = driver.getTitle();
        System.out.println(title);
        //print URL
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());

        //enter email to email field
        WebElement email = driver.findElement(By.id("Email"));
        email.click();

        WebElement emailField = driver.findElement(By.id("username"));
        email.sendKeys("mm@gmail.com");

        //enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("mm@123");

        //click on login button
        WebElement onclick = driver.findElement(By.name("submit"));
        onclick.click();

        //print current page
        String currentURL = "http://the-internet.herokuapp.com/login";
        driver.navigate().back();
        System.out.println("Get current URL" + driver.getCurrentUrl());
        //refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();
    }
}
