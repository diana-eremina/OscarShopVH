import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
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
}
