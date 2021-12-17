import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPageTests3 {
    @Test
    public void booksPage() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://selenium1py.pythonanywhere.com/en-gb/");



        driver.findElement(By.cssSelector(".dropdown-submenu")).click();
        Thread.sleep(5000);

        driver.findElements(By.cssSelector("img")).get(0).click(); //получить список элементов с тегом ing
                                                                    // (это обложки книг) и тыкнуть на первый (0)
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("[value=\"Add to basket\"]")).click();
        Thread.sleep(5000);




        driver.quit();
    }
}
