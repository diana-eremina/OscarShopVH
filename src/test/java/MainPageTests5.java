import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPageTests5 {
    @Test
    public void ClothingMenuTest() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");
        driver.findElement(By.xpath("//a[contains(text(),'Clothing')]")).click();
        Thread.sleep(3000);

        driver.findElements(By.cssSelector("img")).get(0).click(); //получить список обложек и тыкнуть в первую
        Thread.sleep(3000);

        driver.quit();
    }
}
