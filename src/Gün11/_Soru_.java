package Gün11;

/*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
 */

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _Soru_ extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement element1 = driver.findElement(By.id("number1Field"));
        WebElement element2 = driver.findElement(By.id("number2Field"));
        WebElement islem = driver.findElement(By.id("selectOperationDropdown"));
        Select ddMenu = new Select(islem);
        WebElement calculate = driver.findElement(By.id("calculateButton"));
        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        int sayi1 = 0; int sayi2 = 0; int sayac = 1;

        for (int i = 0; i < 5; i++) {
            sayi1 = (int) (Math.random() * 100);
            sayi2 = (int) (Math.random() * 100);
            element1.sendKeys(Integer.toString(sayi1));
            element2.sendKeys(Integer.toString(sayi2));
            ddMenu.selectByIndex(0);
            calculate.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
            Assert.assertEquals(answer.getAttribute("value"), Integer.toString((sayi1 + sayi2)));
            element1.clear();
            element2.clear();
            System.out.println("toplama işlemi deneme "+sayac++ +" :başarılı");
        }
        for (int i = 0; i < 5; i++) {
            sayi1 = (int) (Math.random() * 100);
            sayi2 = (int) (Math.random() * 100);
            element1.sendKeys(Integer.toString(sayi1));
            element2.sendKeys(Integer.toString(sayi2));
            ddMenu.selectByIndex(1);
            calculate.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
            Assert.assertEquals(answer.getAttribute("value"), Integer.toString((sayi1 - sayi2)));
            element1.clear();
            element2.clear();
            System.out.println("çıkarma işlemi deneme "+sayac++ +" :başarılı");
        }
        for (int i = 0; i < 5; i++) {
            sayi1 = (int) (Math.random() * 100);
            sayi2 = (int) (Math.random() * 100);
            element1.sendKeys(Integer.toString(sayi1));
            element2.sendKeys(Integer.toString(sayi2));
            ddMenu.selectByIndex(2);
            calculate.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
            Assert.assertEquals(answer.getAttribute("value"), Integer.toString((sayi1*sayi2)));
            element1.clear();
            element2.clear();
            System.out.println("çarpma işlemi deneme "+sayac++ +" :başarılı");
        }
        for (int i = 0; i < 5; i++) {
            sayi1 = (int) (Math.random() * 100);
            sayi2 = (int) (Math.random() * 100);
            element1.sendKeys(Integer.toString(sayi1));
            element2.sendKeys(Integer.toString(sayi2));
            ddMenu.selectByIndex(3);
            calculate.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
            Assert.assertEquals(answer.getAttribute("value"), Double.toString((double)sayi1 / (double)sayi2));
            element1.clear();
            element2.clear();
            System.out.println("bölme işlemi deneme "+sayac++ +" :başarılı");
        }
        for (int i = 0; i < 5; i++) {
            sayi1 = (int) (Math.random() * 100);
            sayi2 = (int) (Math.random() * 100);
            element1.sendKeys(Integer.toString(sayi1));
            element2.sendKeys(Integer.toString(sayi2));
            ddMenu.selectByIndex(4);
            calculate.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
            Assert.assertEquals(answer.getAttribute("value"),String.valueOf(sayi1)+(sayi2));
            element1.clear();
            element2.clear();
            System.out.println("ekleme işlemi deneme "+sayac++ +" :başarılı");
        }

        BekleKapat();
    }
}
