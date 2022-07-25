package Odevler._07_19;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
/*        1) Bu siteye gidin. -> https://demo.applitools.com/
          2) Username kısmına "ttechno@gmail.com" girin.                    //input[1]
          3) Password kısmına "techno123." girin.                           //input[@type='password']
          4) "Sign in" buttonunan tıklayınız.                               //a[text()='Sign in']
          5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.    //h6[text()='Your nearest branch closes in: 30m 5s']
 */
        driver.get("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.xpath("//input[1]"));
        username.sendKeys("ttechno@gmail.com");
        Bekle(2);

        WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("techno123.");
        Bekle(2);

        WebElement signIn=driver.findElement(By.xpath("//a[text()='Sign in']"));
        signIn.click();
        Bekle(2);

        WebElement display=driver.findElement(By.xpath("//h6[text()='Your nearest branch closes in: 30m 5s']"));

        Assert.assertTrue(display.getText().contains("Your nearest branch closes in: 30m 5s"));

        BekleKapat();

    }
}
