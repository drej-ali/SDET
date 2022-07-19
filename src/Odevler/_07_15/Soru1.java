package Odevler._07_15;
import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {
/*  1) Bu siteye gidin. ->  http://demoqa.com/text-box
    2) Full Name kısmına "Automation" girin.
    3) Email kısmına "Testing" girin.
    4) Current Address kısmına "Testing Current Address" girin.
    5) Permanent Address kısmına "Testing Permanent Address" girin.
    6) Submit butonuna tıklayınız.
    7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
    8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.*/
        driver.get("http://demoqa.com/text-box");
        WebElement element=driver.findElement(By.id("userName"));            element.sendKeys("Muhammed Ali Güler");
        WebElement element1=driver.findElement(By.id("userEmail"));          element1.sendKeys("godguestt@gmail.com");
        WebElement element2=driver.findElement(By.id("currentAddress"));     element2.sendKeys("Testing Current Address");
        WebElement element3=driver.findElement(By.id("permanentAddress"));   element3.sendKeys("Testing Permanent Address");
        WebElement element4=driver.findElement(By.id("submit"));             element4.click();
        WebElement element5=driver.findElement(By.id("name"));
        WebElement element6=driver.findElement(By.id("email"));
        if (element5.getText().contains("Muhammed Ali Güler")&&element6.getText().contains("godguestt@gmail.com")){
            System.out.println("FullName \"Muhammed Ali Güler\" içeriyor.");
            System.out.println("Email \"godguestt@gmail.com\"'i içeriyor.");
            System.out.println("Test passed.");
        }
        BekleKapat();
    }
}
