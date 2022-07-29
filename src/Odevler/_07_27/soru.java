package Odevler._07_27;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class soru extends BaseStaticDriver {
    public static void main(String[] args) {
/*      1- https://www.youtube.com/ adresine gidiniz
        2- "Selenium" kelimesi ile video aratınız.
        3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
        4- Son videonun title ını yazdırınız.*/

        driver.get("https://www.youtube.com/");
        JavascriptExecutor js= (JavascriptExecutor)driver;

        WebElement search= driver.findElement(By.xpath("//input[@id]"));
        search.sendKeys("Selenium");
        WebElement searchButton= driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();
        Bekle(2);

        List<WebElement> list; //sadece videolar
        List<WebElement> list1; //sadece playlistler
        List<WebElement> list2; //sadece radyo yayını
        int toplam;

        do {
            js.executeScript("window.scrollBy(0,10000)");
            Bekle(2);
            list=  driver.findElements(By.xpath("//ytd-video-renderer"));
            list1= driver.findElements(By.xpath("//ytd-playlist-renderer"));
            list2= driver.findElements(By.xpath("//ytd-radio-renderer"));
            toplam=list.size()+list1.size()+list2.size();
        }while (toplam<80);

        List<WebElement> list3= driver.findElements(By.xpath("//a[@id='video-title']"));
        System.out.println(list3.get(list3.size()-1).getText());

        BekleKapat();
    }
}
