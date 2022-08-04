package Odevler.karalama;

import org.openqa.selenium.By;

import static Utils.BaseStaticDriver.driver;

public class karalama  {
    public static void main(String[] args)  {
        //animasyon
        char[] animationChars = new char[]{'|', '/', '-', '\\' };

        for (int i = 0; i <= 100; i++) {
            System.out.print("Report is being prepared: " + i + "% " + animationChars[i % 4] + "\r");

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //iframe bulma
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        for (int i = 0; i <= size; i++) {
            driver.switchTo().frame(i);
            int toplam = driver.findElements(By.xpath("//input[@placeholder='Kart numarası']")).size();
            System.out.print(toplam);
            if (toplam==1)break;
            driver.switchTo (). parentFrame ();
        }












    }
}
