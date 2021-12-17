import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPageTests {
    @Test
    public void isItMainPage() {
        ChromeDriver driver = new ChromeDriver(); // инициализация драйвера - в каждом тесте
        driver.manage().window().maximize();

        driver.get("http://selenium1py.pythonanywhere.com/en-gb/"); // перейти на страницу - в каждом тесте

        try { // ждем 5 секунд
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(driver.getTitle()); // вывод названия сайта в консоль


        driver.quit(); // закрытие драйвера, в каждом тесте
    }
}
