import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests10 extends TestBase {

    @Test
    public void Language2() throws InterruptedException {
        Select selectLang = new Select(driver.findElement(By.cssSelector("[name=\"language\"]")));
        // Select -- чтобы его выбрать, надо нажать alt+enter, это селект от селениума
        // - чтобы потом в нем варианты выбирать можно было
        selectLang.selectByVisibleText("Русский");
        Thread.sleep(1000);


        /* Моя версия сделать то же самое, без использования Select:
        driver.findElement(By.cssSelector("[name=\"language\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("[value=\"ru\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("button.btn.btn-default[type=\"submit\"]")).click();
        Thread.sleep(1000);
        */

    }



}
