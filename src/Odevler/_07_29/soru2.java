package Odevler._07_29;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement eBook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick*='1595015']")));
        eBook.click();
        driver.switchTo().frame(5);
        WebElement addPromo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add Promo Code']")));
        addPromo.click();
        WebElement input=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='Promo-Code-Value']")));
        input.sendKeys("123456789");
        WebElement apply=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply']")));
        apply.click();
        WebElement code=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Invalid promo code']")));
        Assert.assertTrue(code.getText().equals("Invalid promo code"));
        BekleKapat();
    }
}
