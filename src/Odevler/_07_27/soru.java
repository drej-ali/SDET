package Odevler._07_27;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class soru extends BaseStaticDriver {
    public static void main(String[] args) {
/*      1- https://www.youtube.com/ adresine gidiniz
        2- "Selenium" kelimesi ile video aratınız.
        3- Listelenen sonuçlarda 80 videoya kadar listeyi uzatınız.
        4- Son videonun title ını yazdırınız.
        */

        driver.get("https://www.youtube.com/");
        JavascriptExecutor js= (JavascriptExecutor)driver;

        WebElement search= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id]")));
        search.sendKeys("Selenium");
        WebElement searchButton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-icon-legacy")));
        searchButton.click();
        Bekle(2);

        List<WebElement> list;

        do {
            list=  driver.findElements(By.cssSelector("[width='360']"));
            js.executeScript("window.scrollBy(0,10000)");
            Bekle(2);
        }while (list.size()<80);


        List<WebElement> list1= driver.findElements(By.xpath("//ytd-video-renderer"));
        System.out.println(list1.get(list1.size()-1).getText());










        BekleKapat();
    }
}
