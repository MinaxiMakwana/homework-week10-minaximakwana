package comutimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser
 */
public class ComUtimateqa {
     static String browser = "Chrome";
     static String baseUrl = "https://courses.ultimateqa.com/";
     static WebDriver driver;

    public static void main(String[] args) {
        //set Chrome browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        //navigate to base Url
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print title page
        System.out.println(driver.getTitle());
        //print current URL
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());

        //Click on ‘Sign In’ link
        WebElement signIn = driver.findElement(By.id("https://courses.ultimateqa.com/users/sign_in"));
        signIn.click();

        //Enter the email to email field.
        WebElement email = driver.findElement(By.id("email"));
        email.click();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("mm@gmail.com");

        //enter password
        WebElement passwordField = driver.findElement((By.name("password")));
        passwordField.sendKeys("MM123");

        //click on login button
        WebElement login = driver.findElement(By.linkText("button button-primary g-recaptcha"));
        login.click();

        //Navigate to base URL
        driver.get(baseUrl);

        //Navigate forward to Homepage
        driver.navigate().forward();
        System.out.println("Get current URL" + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
        driver.quit();

    }
}
