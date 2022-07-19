package Odevler._07_19;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
    /*  1) Bu siteye gidin. -> https://demo.applitools.com/
        2) Username kısmına "ttechno@gmail.com" girin.                           .form-group>input
        3) Password kısmına "techno123." girin.                          [class='form-control'][placeholder='Enter your password']
        4) "Sign in" buttonunan tıklayınız.                                     .buttons-w a#log-in
        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.   .element-actions+h6
*/
        driver.get("https://demo.applitools.com/");

        WebElement username=driver.findElement(By.cssSelector(".form-group>input"));
        username.sendKeys("ttechno@gmail.com");
        Bekle(2);

        WebElement password=driver.findElement(By.cssSelector("[class='form-control'][placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        Bekle(2);

        WebElement signIn=driver.findElement(By.cssSelector(".buttons-w a#log-in"));
        signIn.click();
        Bekle(2);

        WebElement display=driver.findElement(By.cssSelector(".element-actions+h6"));

        if (display.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Test passed :)...");
        else System.out.println("Test failed !...");

        BekleKapat();

    }
}
