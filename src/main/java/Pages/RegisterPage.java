package Pages;

import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    By txtFirstUsername= By.id("customer.firstName");
    By txtLastName= By.id("customer.lastName");
    By txtAddress= By.id("customer.address.street");
    By txtCity= By.id("customer.address.city");
    By txtState= By.id("customer.address.state");
    By txtZipCode= By.id("customer.address.zipCode");
    By txtPhone= By.id("customer.phoneNumber");
    By txtSSN= By.id("customer.ssn");
    By txtUserName= By.id("customer.username");
    By lblErrorUsername= By.id("customer.username.errors");
    By txtPassword= By.id("customer.password");
    By txtConfirm= By.id("repeatedPassword");

    By btnRegister= By.cssSelector("input[value='Register']");




    public RegisterPage fillFirstName (String text){

        driver.findElement(txtFirstUsername).sendKeys(text);

        return this;

    }

    public RegisterPage fillLastName (String text){

        driver.findElement(txtLastName).sendKeys(text);

        return this;
    }

    public RegisterPage fillAddress (String text){

        driver.findElement(txtAddress).sendKeys(text);

        return this;
    }

    public RegisterPage fillCity (String text){

        driver.findElement(txtCity).sendKeys(text);

        return this;
    }

    public RegisterPage fillState (String text){

        driver.findElement(txtState).sendKeys(text);

        return this;
    }

    public RegisterPage fillZipCode (String text){

        driver.findElement(txtZipCode).sendKeys(text);

        return this;
}


    public RegisterPage fillPhone (String text){

        driver.findElement(txtPhone).sendKeys(text);

        return this;
    }

    public RegisterPage fillSSN (String text){

        driver.findElement(txtSSN).sendKeys(text);

        return this;
    }

    public RegisterPage fillUserName (String text){

        driver.findElement(txtUserName).sendKeys(text);

        return this;
    }

    public RegisterPage userNameErrorMessageControl(){

        boolean status = driver.findElement(lblErrorUsername).isDisplayed();
        Assert.assertTrue(status);

        return this;
    }
    public RegisterPage fillPassword (String text){

        driver.findElement(txtPassword).sendKeys(text);

        return this;
    }

    public RegisterPage fillConfirm (String text){

        driver.findElement(txtConfirm).sendKeys(text);

        return this;
    }

    public RegisterPage clickRegister (){

        driver.findElement(btnRegister).click();

        return this;
    }


}
