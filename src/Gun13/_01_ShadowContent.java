package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class _01_ShadowContent extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);

        WebElement shadowWebParent = driver.findElement(By.cssSelector("[class='efilli-layout-tuttur']"));

        SearchContext shadowContent = shadowWebParent.getShadowRoot(); // shadow u aldım
        // içeriği aynı HTML, şimdi onun içinde findElement yapalım

        WebElement kabulBtn = shadowContent.findElement(By.cssSelector("div+div > div+div"));
        System.out.println("kabulBtn.getText() = " + kabulBtn.getText());
        kabulBtn.click();

        BekleVeKapat();
    }


}

//bu sitede shadow ile çerezler çıkıyor ve bunu kapatmak için sahdow un içine girmemiz gerekiyor


//shadow-root aynı bir frame gibi davranıyor. bu nadir karşımıza çıkacak bir şeydir

//DOM : HTML iç yapısının adı
// <> </>

//shadow DOM : saklı DOM






