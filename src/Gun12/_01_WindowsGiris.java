package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _01_WindowsGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Bekle(2);

        String anaSayfaWindowId = driver.getWindowHandle(); // bulunduğum yani ana sayfanın id si ni aldım

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement e : linkler) {
            // e.click();   //bunu tıklatamadığımızın sebebi sayfanın altında kalması ve sayfayın tam kaydıramadığı için tıklatamadık, bu yüzden javascript ile tıklatıyoruz.
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> windowsIdler = driver.getWindowHandles();
        for (String id : windowsIdler)
            System.out.println("id = " + id);

        MyFunc.Bekle(2);
        driver.switchTo().window(anaSayfaWindowId); // ilgili Window (Tab) a geçiş

        BekleVeKapat();
    }
}
//NOT: web sayfasında tıklandığında yeni bir sekme (seleniumda buna new winow denir) açan linkler html de
// a tagi ve target=_blank olanlardır.