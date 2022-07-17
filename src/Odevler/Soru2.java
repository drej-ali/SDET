package Odevler;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
*/
        driver.get("https://demo.applitools.com/");
        WebElement element=driver.findElement(By.id("username"));        element.sendKeys("ttechno@gmail.com");
        WebElement element1=driver.findElement(By.id("password"));       element1.sendKeys("techno123.");
        WebElement element2=driver.findElement(By.id("log-in"));         element2.click();
        WebElement element3=driver.findElement(By.id("time"));
        if (element3.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("İstenilen yazı görünüyor. \nTest passed");
        BekleKapat();


    }
}
