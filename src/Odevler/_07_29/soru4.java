package Odevler._07_29;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class soru4 extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://shopdemo.e-junkie.com/");
        Robot rbt=new Robot();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement eBook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[onclick*='1595015']")));
        eBook.click();
        driver.switchTo().frame(5);
        WebElement payment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
        payment.click();
        WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
        email.sendKeys("godguestt@gmail.com");
        WebElement emailTekrar=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Confirm Email']")));
        emailTekrar.sendKeys("godguestt@gmail.com");
        WebElement cardName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Name On Card']")));
        cardName.sendKeys("God Guest");
        WebElement phone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Phone']//following-sibling::input")));
        phone.sendKeys("+905558115659");
        WebElement adres=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Company']//following-sibling::input")));
        adres.sendKeys("Hatay/Antakya");
        driver.switchTo().frame(2);
        WebElement cardNo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Kart numarası']")));
        cardNo.sendKeys("42424242424242421222000");
        driver.switchTo().parentFrame();
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Pay-Button']")));
        button.click();
        Bekle(10);
        WebElement teyit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='God, your order is confirmed. Thank you!']")));
        Assert.assertTrue(teyit.getText().equals("God, your order is confirmed. Thank you!"));
        BekleKapat();
    }
}
