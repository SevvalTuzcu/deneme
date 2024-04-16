import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.junit.Test;

public class RegisterTests extends BaseTest {

    LoginPage loginPage= new LoginPage();

    RegisterPage registerPage= new RegisterPage();
    HomePage homePage=new HomePage();




    @Test
    public void userCreate(){

        String username= "testqa1234"+createRandomNumber(100000);

    loginPage
            .clickRegister();

    registerPage
            .fillFirstName("TEST QA")
            .fillLastName("QA TEST")
            .fillAddress("Deneme Mah.")
            .fillCity("ISTANBUL")
            .fillState("TURKIYE")
            .fillZipCode("34")
            .fillPhone("8254")
            .fillSSN("9876")
            .fillUserName(username)
            .fillPassword("123")
            .fillConfirm("123")
            .clickRegister();

    homePage.usernameControl("Welcome " + username);
    }

    @Test
    public void notValidUser(){

        String username= "testqa1234";

        loginPage
                .clickRegister();

        registerPage
                .fillFirstName("TEST QA")
                .fillLastName("QA TEST")
                .fillAddress("Deneme Mah.")
                .fillCity("ISTANBUL")
                .fillState("TURKIYE")
                .fillZipCode("34")
                .fillPhone("8254")
                .fillSSN("9876")
                .fillUserName(username)
                .fillPassword("123")
                .fillConfirm("123")
                .clickRegister()

                .userNameErrorMessageControl();

    }

}
