import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPageTests2 {
    @Test
    public void isItMainPage() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver(); // инициализация драйвера - в каждом тесте
        driver.manage().window().maximize();

        driver.get("http://selenium1py.pythonanywhere.com/en-gb/"); // перейти на страницу - в каждом тесте


        driver.findElementByTagName("select").click();
        driver.findElementById("language_selector");

        Thread.sleep(5000); //если потсавить мышь на подтчеркнутое sleep, alt+enter,
                                 // нажать Add excepеion to method signature -- то в самом начале
                                 // метода появляется строка "throws InterruptedException"




        driver.quit(); // закрытие драйвера, в каждом тесте
    }
}
