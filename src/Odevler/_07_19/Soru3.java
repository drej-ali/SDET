package Odevler._07_19;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
/*        1) Bu siteye gidin. -> https://www.snapdeal.com/
          2) "teddy bear" aratın ve                 //*[@name='keyword' and @placeholder='Search products & brands']
          3)Search butonuna tıklayın.                  //span[@class='searchTextSpan']
          4) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')   //span[@class='nnn'][1]
          Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.*/
        driver.get("https://www.snapdeal.com/");

        WebElement text=driver.findElement(By.xpath("//*[@name='keyword' and @placeholder='Search products & brands']"));
        text.sendKeys("teddy bear");
        Bekle(2);
        WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        search.click();
        Bekle(2);
        WebElement display=driver.findElement(By.xpath("//span[@class='nnn'][1]"));
        Bekle(2);

        Assert.assertTrue(display.getText().contains("We've got 290 results for 'teddy bear'"));


        BekleKapat();
    }
}
