import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPageTests6 {
    @Test
    public void viewBasketTest() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");

        // клик на 'View basket'
        driver.findElements(By.xpath("//span[@class=\"btn-group\"]/a[contains(text(),'View basket')]")).get(0).click();
        Thread.sleep(3000);

        // клик на Search -- почему-то не нажимается
        driver.findElement(By.cssSelector(".btn[value=\"Search\"]"));
        Thread.sleep(5000);

        driver.quit();
    }
}
