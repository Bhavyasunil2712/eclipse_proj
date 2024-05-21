package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {
    public static void main(String[] args) {
        // Setup ChromeDriver
       
        WebDriver driver = new ChromeDriver();
        System.setProperty("C:\\Users\\a0860876\\OneDrive - Aon\\Documents\\QA Automation\\WebDriver\\Bin\\chromedriver.exe", "path");
        driver = new ChromeDriver();

       // webdriver.chrome
        // Navigate to Amazon's login page
        driver.get("https://www.amazon.com/ap/signin");

        // Find the email input field and enter the username
        WebElement emailInput = driver.findElement(By.id("ap_email"));
        emailInput.sendKeys("YOUR_USERNAME");

        // Find the continue button and click it
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Find the password input field and enter the password
        WebElement passwordInput = driver.findElement(By.id("ap_password"));
        passwordInput.sendKeys("YOUR_PASSWORD");

        // Find the sign-in button and click it
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();

        // Close the browser
        driver.quit();
    }
}