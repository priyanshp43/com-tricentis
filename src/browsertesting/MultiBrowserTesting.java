package browsertesting;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url. “https://demowebshop.tricentis.com/login ”
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTesting {


    static String browser = "Firefox";
    static String baseUrl = "https://demowebshop.tricentis.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver=new EdgeDriver();
        }else{
            System.out.println("Wrong Browser name");
        }


        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        System.out.println("The page source is: " + driver.getPageSource());
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().to("https://demowebshop.tricentis.com/login");

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("priyanshp904@gmail.com");

        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        loginButton.click();

       driver.quit();






    }
}
