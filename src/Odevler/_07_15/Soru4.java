package Odevler._07_15;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*  Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Calculate'e tıklayınız.
        İlk input'a herhangi bir sayı giriniz.
        İkinci input'a herhangi bir sayı giriniz.
        Calculate button'una tıklayınız.
        Sonucu alınız.
        Sonucu yazdırınız.*/

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element=driver.findElement(By.id("calculate"));        element.click();
        WebElement element1=driver.findElement(By.id("number1"));         element1.sendKeys("12");
        WebElement element2=driver.findElement(By.id("number2"));         element2.sendKeys("35");
        WebElement element3=driver.findElement(By.id("calculate"));          element3.click();
        WebElement element4=driver.findElement(By.id("answer"));
        System.out.println("Sonuç="+element4.getText());
    }
}
