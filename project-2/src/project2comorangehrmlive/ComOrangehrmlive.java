package project2comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ComOrangehrmlive {
    public static void main(String[] args) {

        //set up Chrome browser
        String baseUrl = " https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();
        //open URL
        driver.get(" https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //print the title page
        String title = driver.getTitle();
        System.out.println(title);
        //print current URL
        System.out.println(driver.getCurrentUrl());
        //print page source
        System.out.println(driver.getPageSource());

        //click on 'forgot your password?' link
        WebElement forgotPassword = driver.findElement(By.name("orangehrm-login-forgot"));
        forgotPassword.sendKeys("login-forgot");

        //print current URL
        String loginURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
        //navigate to login page
        System.out.println("Get current URL" + driver.getCurrentUrl());
        //refresh the page
        driver.navigate().refresh();

        //enter email to email field
        WebElement emailField = driver.findElement((By.id("Email")));
        emailField.sendKeys("mm@gmail.com");
        //enter password to password page
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("MM@123");

        //click on login button
        WebElement login = driver.findElement(By.name("Login"));
        login.click();

        //closing the browser
        driver.quit();
    }
}
