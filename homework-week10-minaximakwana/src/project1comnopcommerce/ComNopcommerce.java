package project1comnopcommerce;
/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ComNopcommerce {
    public static void main(String[] args) throws InterruptedException{

        //set up Chrome browser
        String baseUrl = "https://demo.nopcommerce.com/";
        WebDriver driver = new ChromeDriver();
        //open URL
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.getTitle();
        //Printing title page
        System.out.println(title);
        //Printing current URL
        System.out.println(driver.getCurrentUrl());
        //print the page source
        System.out.println(driver.getPageSource());
        //navigate to URL
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //navigate to login page
        driver.navigate().to(loginUrl);
        System.out.println("Get current URL " + driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println("Get current URL " + driver.getCurrentUrl());
        //navigate back to the home page
        System.out.println(driver.getCurrentUrl());
        //refresh the page
        driver.navigate().refresh();
        //enter email
        WebElement loginLink = driver.findElement(By.id("Email"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("mm@gmail.com");
        //enter password
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("MM@123");
        //closing the browser
        driver.quit();
    }
}
