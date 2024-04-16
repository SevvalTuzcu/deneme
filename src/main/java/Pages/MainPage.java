package Pages;

import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MainPage extends BaseTest {

    public MainPage ErrorMessageControl1(String errorMessage){

        String text= driver.findElement(By.cssSelector("#rightPanel > p")).getText();

        Assert.assertEquals(text, errorMessage);

        return this;
    }

    public MainPage ErrorMessageControl2(String errorMessage){

        String text= driver.findElement(By.cssSelector("#rightPanel > p")).getText();


        Assert.assertEquals(text, errorMessage);

        return this;
    }


}
