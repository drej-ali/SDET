package Odevler._07_19;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
/*        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
          Calculate'e tıklayınız.                           //a[@id='calculate']
          İlk input'a herhangi bir sayı giriniz.            //input[@name='number1']
          İkinci input'a herhangi bir sayı giriniz.         //input[@name][2]
          Calculate button'una tıklayınız.                  //input[@value='Calculate']
          Sonucu alınız.                                    //span
          Sonucu yazdırınız.*/
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate=driver.findElement(By.xpath("//a[@id='calculate']"));
        calculate.click();
        Bekle(2);

        WebElement text1=driver.findElement(By.xpath("//input[@name='number1']"));
        text1.sendKeys("10");
        Bekle(2);

        WebElement text2=driver.findElement(By.xpath("//input[@name][2]"));
        text2.sendKeys("25");
        Bekle(2);

        WebElement button=driver.findElement(By.xpath("//input[@value='Calculate']"));
        button.click();
        Bekle(2);

        WebElement answer=driver.findElement(By.xpath("//span"));

        System.out.println("Sonuç="+answer.getText()+" Test passed.:)");






        BekleKapat();

    }
}
