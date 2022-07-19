package Odevler._07_19;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*1) Bu siteye gidin. -> https://www.snapdeal.com/
          2) "teddy bear" aratın ve                                         .header_wrapper [name='keyword']
          3)Search butonuna tıklayın.                                  [class='searchformButton col-xs-4 rippleGrey']
          4) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')   #searchMessageContainer span
          Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.*/

        driver.get("https://www.snapdeal.com/");

        WebElement text=driver.findElement(By.cssSelector(".header_wrapper [name='keyword']"));
        text.sendKeys("teddy bear");
        Bekle(2);
        WebElement search = driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey']"));
        search.click();
        Bekle(2);
        WebElement display=driver.findElement(By.cssSelector("#searchMessageContainer span"));
        display.click();
        Bekle(2);

        if (display.getText().contains("We've got 296 results for 'teddy bear'"))
            System.out.println("Test passed.");
        else System.out.println("Test failed ! ...");

        BekleKapat();







    }
}
