package Gün09;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class proje extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://a.testaddressbook.com/sign_in");

        Actions aksiyon=new Actions(driver);

        WebElement element=driver.findElement(By.xpath("//input[@name='session[email]']"));
        element.sendKeys("godguestt@gmail.com");
        WebElement element1=driver.findElement(By.xpath("//input[@name='session[password]']"));
        element1.sendKeys("qwerty123");
        WebElement element2=driver.findElement(By.xpath("//input[@name='commit']"));
        element2.click();
        WebElement element3=driver.findElement(By.xpath("//a[@data-test='addresses']"));
        element3.click();
        WebElement element4=driver.findElement(By.xpath("//a[@data-test='create']"));
        element4.click();
        WebElement element5=driver.findElement(By.id("address_first_name"));
        element5.sendKeys("Fernando");
        WebElement element6=driver.findElement(By.id("address_last_name"));
        element6.sendKeys("Torres");
        WebElement element7=driver.findElement(By.id("address_street_address"));
        element7.sendKeys("Anfield Rd");
        WebElement element8=driver.findElement(By.id("address_secondary_address"));
        element8.sendKeys("Anfield");
        WebElement element9=driver.findElement(By.id("address_city"));
        element9.sendKeys("Liverpool");
        WebElement element10=driver.findElement(By.id("address_state"));
        element10.click();
        aksiyon.moveToElement(element10).sendKeys("t").sendKeys(Keys.ENTER).build().perform();
        WebElement element11=driver.findElement(By.id("address_zip_code"));
        element11.sendKeys("L4 0TH");
        WebElement element12=driver.findElement(By.id("address_country_us"));
        element12.click();
        WebElement element13=driver.findElement(By.id("address_birthday"));
        element13.sendKeys("23031994");
        WebElement element14=driver.findElement(By.id("address_age"));
        element14.sendKeys("28");
        WebElement element15=driver.findElement(By.id("address_website"));
        element15.sendKeys("https://www.google.com/");
        WebElement element16=driver.findElement(By.id("address_phone"));
        element16.sendKeys("8625747878");
        WebElement element17=driver.findElement(By.id("address_interest_climb"));
        element17.click();
        WebElement element18=driver.findElement(By.id("address_interest_dance"));
        element18.click();
        WebElement element19=driver.findElement(By.id("address_note"));
        element19.sendKeys("Never Back Down");
        WebElement element20=driver.findElement(By.xpath("//input[@value='Create Address']"));
        element20.click();
        WebElement element21=driver.findElement(By.xpath("//span[@data-test='first_name']"));
        Assert.assertTrue(element21.getText().contains("Fernando"));
        WebElement element22=driver.findElement(By.xpath("//span[@data-test='last_name']"));
        Assert.assertTrue(element22.getText().contains("Torres"));
        WebElement element24=driver.findElement(By.xpath("//a[@data-test='addresses']"));
        element24.click();
        WebElement element25=driver.findElement(By.linkText("Edit"));
        element25.click();
        WebElement element26=driver.findElement(By.id("address_first_name"));
        element26.clear();
        element26.sendKeys("Peter");
        WebElement element27=driver.findElement(By.id("address_last_name"));
        element27.clear();
        element27.sendKeys("Crouch");
        WebElement element28=driver.findElement(By.xpath("//input[@value='Update Address']"));
        element28.click();
        WebElement element29=driver.findElement(By.xpath("//span[@data-test='first_name']"));
        Assert.assertTrue(element29.getText().contains("Peter"));
        WebElement element30=driver.findElement(By.xpath("//span[@data-test='last_name']"));
        Assert.assertTrue(element30.getText().contains("Crouch"));
        WebElement element31=driver.findElement(By.xpath("//a[@data-test='addresses']"));
        element31.click();
        WebElement element32=driver.findElement(By.xpath("//a[text()='Destroy']"));
        element32.click();
        driver.switchTo().alert().accept();
        WebElement element33=driver.findElement(By.cssSelector("[data-test='notice'"));
        Assert.assertTrue(element33.getText().equalsIgnoreCase("Address was successfully destroyed."));

        BekleKapat();
    }
}
