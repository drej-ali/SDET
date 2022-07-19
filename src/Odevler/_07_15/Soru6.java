package Odevler._07_15;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
        Fake Alerts'e tıklayınız.
        Show modal dialog buttonuna tıklayınız.
            Ok'a tıklayınız.
        Alert kapanmalıdır.*/
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element=driver.findElement(By.id("fakealerttest"));        element.click();
        WebElement element1=driver.findElement(By.id("modaldialog"));        element1.click();
        WebElement element3=driver.findElement(By.id("dialog-text"));
        if (element3.getText().contains("I am a modal div!"))
            System.out.println("Pencere açık.");
        WebElement element2=driver.findElement(By.id("dialog-ok"));        element2.click();
        if (!element3.getText().contains("I am a modal div!"))
            System.out.println("Pencere kapandı.\nTest passed...");
        BekleKapat();
    }
}
