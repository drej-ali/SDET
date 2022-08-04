package Odevler._07_27;


import Utils.BaseStaticDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;


public class soru1 extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://www.google.com/");
        Robot rbt = new Robot();

        ArrayList<String> webAdressleri = new ArrayList<>();
        webAdressleri.add("https://www.google.com/");
        webAdressleri.add("https://www.twitter.com/");
        webAdressleri.add("https://tr-tr.facebook.com/");

        for (int i = 1; i < 3; i++) {

            rbt.keyPress(KeyEvent.VK_CONTROL);
            rbt.keyPress(KeyEvent.VK_T);

            rbt.keyRelease(KeyEvent.VK_CONTROL);
            rbt.keyRelease(KeyEvent.VK_T);

            Bekle(3);
            ArrayList<String> Sekmeler = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(Sekmeler.get(i)); // Açılan yeni sayfaya focuslanıyor

            Bekle(3);

            driver.get(webAdressleri.get(i));

            BekleKapat();
        }
    }
}
