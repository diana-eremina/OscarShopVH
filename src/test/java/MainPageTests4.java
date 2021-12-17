import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPageTests4 {
    @Test
    public void isItMainPage() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");

        driver.findElement(By.cssSelector("[name=\"language\"]")).click();
        Thread.sleep(4000);

        driver.findElement(By.cssSelector("[value=\"ru\"]")).click();
        Thread.sleep(4000);

        driver.findElement(By.cssSelector("button.btn.btn-default[type=\"submit\"]")).click();
        Thread.sleep(4000);




        driver.quit();
    }
}
