package TestNG.Activityes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.lang.String;


public class Activity2 {

    WebDriver driver;

        @BeforeClass
        public void Setup() {
            WebDriverManager.firefoxdriver().setup();
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            driver = new FirefoxDriver();

            driver.get("https://v1.training-support.net/selenium/target-practice");

        }

        @Test
        public void test1(){

            Assert.assertEquals(driver.getTitle(),"Target Practice");


        }


        @Test
        public void test2(){

            String black_button = driver.findElement(By.cssSelector("button.black")).getText();
            Assert.assertEquals(black_button,"black");


        }

        @Test(enabled = false)
        public void test3(){
            String subHeading = driver.findElement(By.className("sub")).getText();
            System.out.println("skippee");
            Assert.assertTrue(subHeading.contains("Practice"));

        }
        @Test
        public void test4()  {
        throw new SkipException("skipped exception");

        }

        @AfterClass
       public void Close(){

            driver.close();
        }








}
