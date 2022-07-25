package Odevler._07_20;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
/*       http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
         buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.*/

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        for (int i = 1; i < 22; i++) {
            WebElement sehir = driver.findElement(By.id("node" + i));
            for (int j = 1; j < 8; j++) {
                WebElement ulke = driver.findElement(By.id("box" + j));
                Actions aksiyon=new Actions(driver);
                aksiyon.clickAndHold(sehir).moveToElement(ulke).release(ulke).build().perform();
                if (sehir.getCssValue("background-color").equalsIgnoreCase("rgba(0, 128, 0, 1)"))
                    break;
            }
        }
        BekleKapat();
    }
}
