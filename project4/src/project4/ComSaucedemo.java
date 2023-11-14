package project4;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
public class ComSaucedemo {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //setup chrome browser
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //navigate to baseURL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print title of the page
        System.out.println(driver.getTitle());
        //print current URL
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());

        //enter the email to email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.click();

        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("mm@gmail.com");
        //enter password
        WebElement passwordField = driver.findElement((By.name("password")));
        passwordField.sendKeys("MM123");

        //click on login button
        WebElement login = driver.findElement(By.linkText("login-button"));
        login.click();

        //print current URL
        System.out.println(driver.getCurrentUrl());

        //refresh the page
        driver.navigate().refresh();

        //close the browser
        driver.quit();
    }

}
