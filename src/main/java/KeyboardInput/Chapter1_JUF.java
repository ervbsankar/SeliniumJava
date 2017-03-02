package KeyboardInput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by SankarEdala on 3/1/17.
 */
public class Chapter1_JUF{

    WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        Chapter1_JUF in = new Chapter1_JUF();
        in.OpenBrowser();
        in.Checklinks();
        in.closeBrowser();
    }

    public void OpenBrowser()
    {

        System.setProperty("webdriver.chrome.driver", "dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https;//www.google.com/");
    }

    public void Checklinks() throws InterruptedException {
        driver.findElement(By.id("lst-ib")).sendKeys("Minnesota");
        driver.findElement(By.id("_fZl")).click();
        Thread.sleep(  4000);
        driver.findElement(By.linkText("index / Minnesota.gov")).click();
        Thread.sleep(  4000);

    }
    public void closeBrowser()
    {
        driver.close();
    }
}
