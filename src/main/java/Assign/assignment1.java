package Assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://magento.softwaretestingboard.com/");
        
        System.out.println("Title: " + driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());

        driver.findElement(By.linkText("Men")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Tops")).click();
        Thread.sleep(3000);
        
       
         
        driver.findElement(By.cssSelector("#narrow-by-list > div:nth-child(1) > div:nth-child(1)")).click();

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement HoddieandSweatShirt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[2]/a")));
        HoddieandSweatShirt.click();
        String t2 = driver.getTitle();
        System.out.println(t2);
        Thread.sleep(10000);
        
      
         
        
        driver.findElement(By.cssSelector("#narrow-by-list > div:nth-child(10) > div.filter-options-title ")).click();
        
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement price = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"narrow-by-list\"]/div[10]/div[2]/ol/li[2]/a")));
        price.click();
        
        WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement selected = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")));
        selected.click();
        
        
        WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement size = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"option-label-size-143-item-170\"]")));
        size.click();
        
        
        WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement colour = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"option-label-color-93-item-49\"]")));
        colour.click();
        
        
        
        WebDriverWait wait123 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement AddtoCart = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-addtocart-button\"]")));
        AddtoCart.click();
        
        Thread.sleep(5000);
        
        WebDriverWait wait21 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ProcedtoCart = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]")));
        ProcedtoCart.click();
        
        
        
        Thread.sleep(5000);
        
        WebDriverWait wait321 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ProceddtoCart = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[3]")));
        ProceddtoCart.click();
        
        
        
        
        
        Thread.sleep(2000);
        
  
        driver.findElement(By.cssSelector("#customer-email")).sendKeys("yaro1926@gmail.com");
       // Thread.sleep(2000);
        
        
        WebDriverWait wait129= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pass = wait129.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer-password\"]")));
        pass.sendKeys("@Yash12345");
        Thread.sleep(2000);
        
        WebDriverWait wait121 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Login = wait121.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button[1]")));
        Login.click();
        
        
        
        Thread.sleep(2000);

        
        
        WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Final = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")));  //*[@id="shipping-method-buttons-container"]/div/button/span
        Final.click();

        
        
        Thread.sleep(2000);

        
        
        
        WebElement placeOrder = driver.findElement(By.cssSelector("button.checkout"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrder);
        Thread.sleep(1000); // optional buffer

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", placeOrder);

        
        
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement Completed = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#checkout-payment-method-load > div > div > div.payment-method._active > div.payment-method-content > div.actions-toolbar > div > button > span")));  //*[@id="shipping-method-buttons-container"]/div/button/span
//        Completed.click();

        
//        WebDriverWait wait101 = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//     // 1. First Name
//     wait101.until(ExpectedConditions.visibilityOfElementLocated(By.name("First Name "))).sendKeys("Yashm");

//     // 2. Last Name
//     driver.findElement(By.name("lastname")).sendKeys("Sigh");
//
//     // 3. Street Address Line 1
//     driver.findElement(By.name("street[0]")).sendKeys("123 Test Lane");
//
//     // 4. Street Address Line 2 (optional)
//     driver.findElement(By.name("street[1]")).sendKeys("Suite 5");
//
//     // 5. City
//     driver.findElement(By.name("city")).sendKeys("New York");
//
//     // 6. Country
//     Select countrySelect = new Select(driver.findElement(By.name("country_id")));
//     countrySelect.selectByVisibleText("United States");
//
//     // 7. Wait until State/Province dropdown is enabled
//     WebElement region = wait101.until(ExpectedConditions.elementToBeClickable(By.name("region_id")));
//     Select stateSelect = new Select(region);
//     stateSelect.selectByVisibleText("New York");
//
//     // 8. Postal Code
//     driver.findElement(By.name("postcode")).sendKeys("10001");
//
//     // 9. Phone Number
//     driver.findElement(By.name("Phone Number")).sendKeys("9876543210");

        
        
        
        
        
        
        
        
//        Thread.sleep(2000);
//        
//        WebDriverWait wait19= new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement company = wait19.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#JTY3AE1")));
//        company.sendKeys("tweret");
//        Thread.sleep(2000);
        
        //driver.findElement(By.cssSelector("#BVBG4QE")).sendKeys("Test");
//        driver.findElement(By.cssSelector("#BDGNOQ1")).sendKeys("User");
//        driver.findElement(By.cssSelector("#IQ7NN6E")).sendKeys("123 Test Street");
//        driver.findElement(By.cssSelector("#WIOSJ1C")).sendKeys("New York");
//        driver.findElement(By.cssSelector("#AP73NWQ")).sendKeys("Texas");
//        driver.findElement(By.cssSelector("#YT0YW32")).sendKeys("10001");
//        driver.findElement(By.cssSelector("#CFXMMGD")).sendKeys("Iran");
//        driver.findElement(By.cssSelector("#OS8O0Q2")).sendKeys("1234567890");
//
//        Thread.sleep(2000);
////
////        // Select shipping method
//        WebElement shippingMethod = driver.findElement(By.xpath("//input[@value='flatrate_flatrate']"));
//        shippingMethod.click();
////
////        // Click Next
//        driver.findElement(By.xpath("//button[@data-role='opc-continue']")).click();
//
        System.out.println(" Order placed up to payment page.");
//
////        // Final wait an9d quit
//       // Thread.sleep(3000);
//        //driver.quit();
    }
}
