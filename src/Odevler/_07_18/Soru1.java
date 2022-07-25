package Odevler._07_18;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {
        /*  1) Bu siteye gidin. ->  http://demoqa.com/text-box
        2) Full Name kısmına "Automation" girin.                            #userName-wrapper input
        3) Email kısmına "Testing@gmail.com" girin.                         #userEmail-wrapper [autocomplete='off']
        4) Current Address kısmına "Testing Current Address" girin.         [placeholder='Current Address']
        5) Permanent Address kısmına "Testing Permanent Address" girin.     #permanentAddress-wrapper [rows='5']
        6) Submit butonuna tıklayınız.                                      button[class='btn btn-primary']
        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.    #output p
        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.           #output p[class='mb-1']
*/
        driver.get("http://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.cssSelector("#userName-wrapper input"));
        fullName.sendKeys("Muhammed Ali Güler"); Bekle(2);
        WebElement eMail=driver.findElement(By.cssSelector("#userEmail-wrapper [autocomplete='off']"));
        eMail.sendKeys("godguestt@gmail.com"); Bekle(2);
        WebElement current=driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        current.sendKeys("Testing Current Address"); Bekle(2);
        WebElement permanent=driver.findElement(By.cssSelector("#permanentAddress-wrapper [rows='5']"));
        permanent.sendKeys("Testing Permanent Address"); Bekle(2);
        WebElement submit=driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        submit.click(); Bekle(2);
        WebElement fullName1=driver.findElement(By.cssSelector("p.mb-1"));
        WebElement eMail2=driver.findElement(By.cssSelector("p#email"));

        if (fullName1.getText().contains("Muhammed Ali Güler")&&eMail2.getText().contains("godguestt@gmail.com"))
            System.out.println("Test passed...");
        else System.out.println("Test failed ! ...");

        BekleKapat();
    }
}
