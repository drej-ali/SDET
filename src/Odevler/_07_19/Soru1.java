package Odevler._07_19;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {
    /*   1) Bu siteye gidin. ->  http://demoqa.com/text-box
         2) Full Name kısmına "Automation" girin.                               //input[@placeholder='Full Name']
         3) Email kısmına "Testing@gmail.com" girin.                            //*[@id='userEmail']
         4) Current Address kısmına "Testing Current Address" girin.            //textarea[@rows and @placeholder]
         5) Permanent Address kısmına "Testing Permanent Address" girin.        (//textarea)[2]
         6) Submit butonuna tıklayınız.                                         /html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button
         7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.       //p[@id='name']
         8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.              //p[@id='email']
    */
        driver.get("http://demoqa.com/text-box");

        WebElement fullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Muhammed Ali Güler"); Bekle(2);
        WebElement eMail=driver.findElement(By.xpath("//*[@id='userEmail']"));
        eMail.sendKeys("godguestt@gmail.com"); Bekle(2);
        WebElement current=driver.findElement(By.xpath("//textarea[@rows and @placeholder]"));
        current.sendKeys("Testing Current Address"); Bekle(2);
        WebElement permanent=driver.findElement(By.xpath("(//textarea)[2]"));
        permanent.sendKeys("Testing Permanent Address"); Bekle(2);
        WebElement submit=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));
        submit.click(); Bekle(2);
        WebElement fullName1=driver.findElement(By.xpath("//p[@id='name']"));
        WebElement eMail2=driver.findElement(By.xpath("//p[@id='email']"));

        Assert.assertTrue(fullName1.getText().contains("Muhammed Ali Güler")&&eMail2.getText().contains("godguestt@gmail.com"));

        BekleKapat();
    }
}
