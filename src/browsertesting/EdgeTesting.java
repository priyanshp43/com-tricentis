package browsertesting;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demowebshop.tricentis.com/login ”
 * 7. Print the current URL.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current URL.
 * 11. Refresh the page.
 * 12. Enter the email in the email field.
 * 13. Enter the password in the password field.
 * 14. Click on the Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTesting {
    public static void main(String[] args) {
        String baseUrl = "https://demowebshop.tricentis.com/";

        // Launch the Edge browser
        WebDriver driver = new EdgeDriver();

        //Open the URL into browser
        driver.get(baseUrl);

        // Get page title
        System.out.println("Page title is: " + driver.getTitle());

        // Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("The page source is: " + driver.getPageSource());

        // Navigate to Url
        driver.navigate().to("https://demowebshop.tricentis.com/login");

        //Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //  Navigate back to the home page.
        driver.navigate().back();

        //Navigate to the login page.
        driver.navigate().forward();

        // Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Refresh the page.
        driver.navigate().refresh();

        //Enter the email in the email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("priyanshp904@gmail.com");

        // Enter the password in the password field.
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("12345");

        //Click on the Login Button.
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();

        // CLose the browser
         driver.quit();



    }
}
