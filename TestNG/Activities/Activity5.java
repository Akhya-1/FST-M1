package TestNG.Activityes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
WebDriver driver;
@BeforeClass(alwaysRun = true)
    public void beforeclass(){

    driver = new FirefoxDriver();
    driver.get("https://v1.training-support.net/selenium/target-practice");

}
@AfterClass(alwaysRun = true)
    public void afterclass(){

    driver.close();
}

@Test
    public void checkpagetitle(){

    System.out.println(driver.getTitle());
}

@Test(groups = {"HeaderTests"})
    public void header1(){

    String thirdheader= driver.findElement(By.id("third-header")).getText();
    Assert.assertEquals(thirdheader,"Third header");

}

@Test(groups = {"HeaderTests"})
public void header2(){

    String fifth= driver.findElement(By.id("third-header")).getText();
    Assert.assertEquals(fifth,"Third header");

}

@Test(groups = {"Buttontests"})
    public void olive(){

    String olivetext= driver.findElement(By.cssSelector("button.ui.olive.button")).getText();
    Assert.assertEquals(olivetext,"Olive");
}

    @Test(groups = {"Buttontests"})
    public void brown(){

        String browntext= driver.findElement(By.cssSelector("button.ui.brown.button")).getText();
        Assert.assertEquals(browntext,"Brown");
    }


}
