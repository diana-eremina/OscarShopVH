import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests9 extends TestBase {

    @Test
    public void ClothingMenuTest() throws InterruptedException {
        WebElement clothingMenu = driver.findElement(By.xpath("//a[contains(text(),'Clothing')]"));
        // создали переменную для пункта меню
        System.out.println(clothingMenu.getText()); // узнать название кнопки
        System.out.println(clothingMenu.isDisplayed()); // узнать, показывается ли элемент
        System.out.println(clothingMenu.getAttribute("href")); //узнать урл куда ведет
        clothingMenu.click(); // кликаем по этому пункту
        Thread.sleep(1000);

        driver.findElements(By.cssSelector("img")).get(0).click(); //получить список обложек и тыкнуть в первую
        Thread.sleep(1000);

        WebElement ProductInformation = driver.findElement(By.xpath("//h2[contains(text(),\'Product Information\')]"));
        // создали переменную для заголовка Product Information

        Assert.assertTrue(ProductInformation.isDisplayed());
        // ожидаемый результать для проверки, что этот заголовок показывается


    }



}
