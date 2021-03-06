package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

/**
 * Created by gregdorward on 26/01/2017.
 */
public class LoginPage {

    private static WebElement element = null;

    public static WebElement field_Username(WebDriver driver) {

        element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));

        return element;

    }

    public static WebElement field_Password(WebDriver driver) {

        element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));

        return element;

    }

    public static WebElement button_Login(WebDriver driver) {

        element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));

        return element;
    }

    public static WebElement failed_Login_Text(WebDriver driver) {

        element = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));

        return element;
    }
}
