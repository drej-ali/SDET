package Odevler._07_19;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
      /*Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
        Calculate'e tıklayınız.                                 .page-body #calculate
        İlk input'a herhangi bir sayı giriniz.                  [action='calculate.php']>input
        İkinci input'a herhangi bir sayı giriniz.               #function+input
        Calculate button'una tıklayınız.                        #function~#calculate
        Sonucu alınız.                                          [action='calculate.php']+ #answer
        Sonucu yazdırınız.*/
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate=driver.findElement(By.cssSelector(".page-body #calculate"));
        calculate.click();
        Bekle(2);

        WebElement text1=driver.findElement(By.cssSelector("[action='calculate.php']>input"));
        text1.sendKeys("10");
        Bekle(2);

        WebElement text2=driver.findElement(By.cssSelector("#function+input"));
        text2.sendKeys("25");
        Bekle(2);

        WebElement button=driver.findElement(By.cssSelector("#function~#calculate"));
        button.click();
        Bekle(2);

        WebElement answer=driver.findElement(By.cssSelector("[action='calculate.php']+ #answer"));

        System.out.println("Sonuç="+answer.getText()+"Test passed.:)");

        BekleKapat();


    }
}
