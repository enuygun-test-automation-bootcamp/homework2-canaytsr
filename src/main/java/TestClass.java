import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertNotNull;

public class TestClass {
    public WebDriver driver;
    @Before
    public void beforeMethod() {
        // Driver konumu eklenmesi
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nedmod\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Bir ChromeDriver sınıfı oluşturulması
        driver = new ChromeDriver();
        // Web Sitesini Başlatılması
        driver.get("https://demoqa.com/webtables");
        // Browser penceresi büyütülmesi
        driver.manage().window().maximize();
    }

    @Test
    public void testMethod1() { //1.yol
        // driver'ın verilen id ile bulduğu bir yapı varsa testi geçer
        assertNotNull("searchBox is found.", driver.findElement(By.id("searchBox")));

    }
    @Test
    public void testMethod2() { //2.yol
        // Eğer driver bir element bulursa ekrana searchBox bulundu yazdırır
        if (driver.findElement(By.id("searchBox")) != null) {
            System.out.println("searchBox bulundu.");

        }
        // Eğer driver bir element bulamazsa ekrana searchBox bulunamadı yazdırır
        else {
            System.out.println("searchBox bulunamadı!");

        }

    }

    @After
    public void afterMethod() {
        // driver'ı sonlandırır
        driver.quit();

    }


}
