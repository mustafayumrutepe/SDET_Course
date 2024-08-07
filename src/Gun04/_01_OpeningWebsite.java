package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebsite {
    public static void main(String[] args) {

        // oop WebDriver->Interface,Parent Class        ChromeDriver,FirefoxDriver,EdgeDriver-> child class
        WebDriver driver = new ChromeDriver(); // driver = browser, tarayıcı
//        WebDriver driver2= new FirefoxDriver();
//        WebDriver driver3= new EdgeDriver();

        driver.get("https://techno.study/tr"); //  web sayfasını açma

                //NOT:web sayfası açıldıktan sonra onu kendimiz manuel olarak kapatsak bile
                //gerçekte kapanmıyor, bunu task managerda görebiliriz, ve bilgisayarımzı yavaşlatıyor
                //onun için aşagıdaki gibi driver.close veya driver.quit yapmalıyız.

        MyFunc.Bekle(3);
        //driver.close(); // o anda aktif olan açık tarayıcıyı kapatıyor,
        // hafızadan siliyor
        driver.quit(); // program çalışırken açılmış bütün tarayıcıları
        // hem kapatıp hem de hafızadan siler
    }
}


//    hata olmayan ama run yapınca olusan kırmızılıkların gıtmesı için adımlar:
//
//        projenın üzerine tıkla
//        sonra sağ tıkla
//open module settings e tıkla
//libraries e tıkla
//+ işaretine tıkla
//        from maven e tıkla
//        org.slf4j:slf4j-nop:1.7.30    ---> bunu yapıstır arama yerine ve ok ok de
//        sonra projeni run yap tekrar bak kırmızılıklar