package Odevler._07_20;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {
/*        http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
        buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.*/
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Bekle(2);

        for (int i = 1; i < 16; i++) {
            WebElement sehir = driver.findElement(By.id("a" + i));
            for (int j = 1; j < 16; j++) {
                WebElement hedef = driver.findElement(By.id("q" + j));
                Actions aksiyonlar = new Actions(driver);
                aksiyonlar.clickAndHold(sehir).moveToElement(hedef).release(hedef).build().perform();
                if (sehir.getCssValue("background-color").equalsIgnoreCase("rgba(0, 128, 0, 1)"))
                    break;
            }
        }
        BekleKapat();
    }
}
