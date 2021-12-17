import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests7 extends TestBase {
    ChromeDriver driver; // объявили драйвер и сказали, чему он равен

    @BeforeMethod // перед методом = перед каждым тестом
    public void initDriver(){
        driver = new ChromeDriver(); // в тесте уже вместо ChromeDriver driver пишем driver
        driver.manage().window().maximize();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");
    }

    @AfterMethod // в конце каждого теста
    public void quitDriver(){
        driver.quit(); // закрытие драйвера
    }

    @Test
    public void booksMenuTest() throws InterruptedException {
        // отсюда убрали инициализацию драйвера, размер стр, переход по урлу (вынос выше в @BeforeMethod)

        driver.findElement(By.cssSelector(".dropdown-submenu")).click();
        Thread.sleep(3000);

        driver.findElements(By.cssSelector("img")).get(0).click(); //получить обложки, ткнуть в первую
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("[value=\"Add to basket\"]")).click();
        Thread.sleep(3000);
    }

    @Test
    public void ClothingMenuTest() throws InterruptedException {
        // отсюда тоже убрали

        driver.findElement(By.xpath("//a[contains(text(),'Clothing')]")).click(); // переход в раздел Clothing
        Thread.sleep(3000);

        driver.findElements(By.cssSelector("img")).get(0).click(); //получить список обложек и тыкнуть в первую
        Thread.sleep(3000);
    }

}
