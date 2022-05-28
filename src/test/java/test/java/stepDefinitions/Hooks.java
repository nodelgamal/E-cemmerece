package test.java.stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver = null;

    @Before

    public static void openbrowser () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Taroook-3ashry\\IdeaProjects\\untitled7\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }


    @After()

    public static void quitdriver() throws InterruptedException {
    Thread.sleep(4000);
        driver.quit();
    }

    }

