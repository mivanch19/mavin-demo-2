import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duotech.io/");
        String expected = "Software QA Automation Engineer program | SDET | QA School | Software Testing";
        String actual = driver.getTitle();

        Assert.assertEquals(actual,expected);
        driver.quit();
    }
}
