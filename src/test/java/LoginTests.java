import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.junit.*;



public class LoginTests extends BaseTest

{

    LoginPage loginPage = new LoginPage();

    MainPage mainPage= new MainPage();

    HomePage homePage= new HomePage();


    @Test
    public void FailUserTEST(){

        loginPage
                .fillUsername("TEST")
                .fillPassword("QA")
                .clickLogin();


        mainPage
                .ErrorMessageControl1(errorMessage1);


    }

    @Test
    public void FailPasswordTEST(){

        loginPage
                .fillUsername("TEST")
                .clickLogin();

        loginPage
                .fillUsername("TEST")
                .clickLogin();

        mainPage
                .ErrorMessageControl2(errorMessage2);
    }

    @Test
    public void NonDataTEST(){


        loginPage
                .fillUsername("")
                .fillPassword("")
                .clickLogin();

        mainPage
                .ErrorMessageControl2(errorMessage2);

    }

    @Test
    public void MinCharTEST() {

        loginPage
                .fillUsername("1")
                        .fillPassword("1")
                                .clickLogin();


        mainPage
                .ErrorMessageControl1(errorMessage1);

    }

    @Test
    public void MaxCharTEST(){

        loginPage
                .fillUsername("2345465434545675542565432")
                        .fillPassword("3456786544244576543224567")
                                .clickLogin();

        mainPage
                .ErrorMessageControl1(errorMessage1);


    }

    @Test
    public void SuccessTEST(){

        loginPage
                .fillUsername(username)
                        .fillPassword(password)
                                .clickLogin();


        homePage
                .pageControl("Account Overview");


       }

}


