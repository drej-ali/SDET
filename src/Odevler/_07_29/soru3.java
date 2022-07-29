package Odevler._07_29;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement eBook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick*='1595015']")));
        eBook.click();
        driver.switchTo().frame(5);
        WebElement payment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
        payment.click();
        WebElement pay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Pay-Button']")));
        pay.click();
        WebElement teyit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Invalid Email']")));
        Assert.assertTrue(teyit.getText().equals("Invalid Email\n" +
                "Invalid Email\n" +
                "Invalid Billing Name"));
        BekleKapat();
    }
}
