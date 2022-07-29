package Odevler._07_29;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class soru1 extends BaseStaticDriver{
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement eBook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick*='1595015']")));
        eBook.click();
        driver.switchTo().frame(5);
        WebElement cartQuantity=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));
        Assert.assertTrue(cartQuantity.getAttribute("value").equals("1"));
        WebElement remove = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Product-Remove']")));
        remove.click();
        WebElement conti = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Continue-Button Close-Cart']")));
        conti.click();
        driver.switchTo().defaultContent();
        WebElement sepetBos =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart_item_nos")));
        Assert.assertTrue(sepetBos.getText().equals("0"));
        BekleKapat();
    }
}
