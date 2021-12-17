import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests8 extends TestBase { // нужно указать extends, тк в класс TestBase
                                               // вынесена нициализация драйвера, переход по урлу, размер стр

    @Test
    public void booksMenuTest() throws InterruptedException {
        // инициализация драйвера, размер стр, переход по урлу вынесен в отдельный класс TestBase

        driver.findElement(By.cssSelector(".dropdown-submenu")).click();
        Thread.sleep(3000);

        driver.findElements(By.cssSelector("img")).get(0).click(); //получить обложки, ткнуть в первую
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[value=\"Add to basket\"]")).click();
        Thread.sleep(3000);
    }

    @Test
    public void ClothingMenuTest() throws InterruptedException {
        // инициализация драйвера, размер стр, переход по урлу вынесен в отдельный класс TestBase

        driver.findElement(By.xpath("//a[contains(text(),'Clothing')]")).click(); // переход в раздел Clothing
        Thread.sleep(3000);

        driver.findElements(By.cssSelector("img")).get(0).click(); //получить список обложек и тыкнуть в первую
        Thread.sleep(3000);
    }

}
