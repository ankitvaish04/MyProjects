package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://flipkart.com")
public class FlipkartDefaultPage extends PageObject {

    public static Target USER_NAME = Target
            .the("Username field")
            .located(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));

    public static Target PASSWORD = Target
            .the("Password field")
            .locatedBy("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input");

    public static Target LOGIN_BUTTON = Target
            .the("Login button")
            .locatedBy("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span");

}
