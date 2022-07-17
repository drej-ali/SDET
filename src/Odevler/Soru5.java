package Odevler;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*  Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Fake Alerts' tıklayınız.
        Show Alert Box'a tıklayınız.
        Ok'a tıklayınız.
        Alert kapanmalıdır.*/
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element=driver.findElement(By.id("fakealerttest"));        element.click();
        WebElement element1=driver.findElement(By.id("fakealert"));        element1.click();
        WebElement element3=driver.findElement(By.id("dialog-text"));
        if (element3.getText().contains("I am a fake alert box!"))
            System.out.println("Alarm çalıyor !...");
        WebElement element2=driver.findElement(By.id("dialog-ok"));        element2.click();
        if (!element3.getText().contains("I am a fake alert box!"))
            System.out.println("Alarm kapandı.\nTest passed...");
        BekleKapat();
    }
}
