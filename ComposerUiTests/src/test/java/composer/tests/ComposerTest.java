package composer.tests;

import composer.ui.MainPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;


public class ComposerTest  extends BaseTest{

    @Test
    public void canLoginAsAdmin(){
        MainPage.open();
        MainPage.login();
        MainPage.header.should(have(text("Composer")));
//        MainPage.title.should(have(text("Composer for Display")));
    }

    @Test
    public void navigationOptionsAreWorking() throws InterruptedException {
        MainPage.open();
//        MainPage.login();
        MainPage.creativeGenerator.click();
        MainPage.uploadNewHTMLFile.should(visible);
        MainPage.vastTools.click();
        MainPage.adminTools.click();
        MainPage.authTokens.should(visible);
        MainPage.authTokens.click();
        MainPage.projectView.click();
//        MainPage.removeAllProjects();
    }

}


