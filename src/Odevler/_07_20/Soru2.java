package Odevler._07_20;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
/*        http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
        buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.*/
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        for (int i = 1; i <22 ; i++) {
            WebElement ogr= driver.findElement(By.id("node"+i));
            int a = 0;
            if      (i<5)        a=1;
            else if (i>4&&i<9)   a=2;
            else if (i>8&&i<13)  a=3;
            else if (i>12&&i<16) a=4;
            else if (i>15&&i<22) a=5;
            WebElement box= driver.findElement(By.id("box"+a));
            Actions aksiyonlar=new Actions(driver);
            aksiyonlar.clickAndHold(ogr).moveToElement(box).release().build().perform();
        }
        BekleKapat();
    }
}
