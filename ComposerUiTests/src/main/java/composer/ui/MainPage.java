package composer.ui;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public static SelenideElement loginWithOcta = $(By.xpath("//button/span[text()='Login with Okta']"));
    public static SelenideElement clientsLogin = $(By.xpath("//button/span[text()='Clients Login']"));

    public static SelenideElement title =$(By.xpath("//head/title"));
    public static SelenideElement header = $("div[class='logo grow y-centered-content'] a");
//    NAVIGATION
    public static SelenideElement projectView = $("li a[href^='#/project_view/']");

    public static SelenideElement creativeGenerator = $("li a[href^='#/ad-generator']");
    public static SelenideElement uploadNewHTMLFile = $("button[class='button-primary ']");


    public static SelenideElement vastTools = $("li a[href='#/vast-group']");
    public static SelenideElement adminTools = $("li a[href='#/Admin-group']");
    public static SelenideElement authTokens = $(".message a[href='#/tokens']");

    public static MainPage open() {
        Selenide.open("/");
        return new MainPage();
    }

    public static void login() {
//        clientsLogin.click();
        loginWithOcta.click();
        $(By.id("okta-signin-username")).setValue("admin@email.com");
        $(By.id("okta-signin-password")).setValue("0kt@!$Terrible");
        $(By.id("okta-signin-submit")).click();

    }

    public static void removeAllProjects() {
        sleep(2000);
        while ($$("svg[data-icon='trash']").iterator().hasNext()){
            $$("svg[data-icon='trash']").iterator().next().click();
            $("button[class=' button-focus button-primary min-width-150']").click();
            sleep(1000);
        }

    }
}
