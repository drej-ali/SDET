package Odevler._07_15;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*1) Bu siteye gidin. -> https://www.snapdeal.com/
          2) "teddy bear" aratın ve  Search butonuna tıklayın.
          3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
          Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.*/
        driver.get("https://www.snapdeal.com/");

        WebElement element=driver.findElement(By.name("keyword"));              element.sendKeys("teddy bear");
        WebElement element1=driver.findElement(By.className("searchTextSpan")); element1.click();
        Bekle(2);
        WebElement element2 = driver.findElement(By.className("nnn"));
            if (element2.getText().contains("We've got 294 results for 'teddy bear'"))
                System.out.println("Test passed.");
        BekleKapat();

    }
}
