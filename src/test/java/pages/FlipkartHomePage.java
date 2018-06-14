package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

public class FlipkartHomePage extends PageObject {

    public static Target salutationLabel = Target
            .the("Salutation Text")
            .located(By.xpath("//*[@id='container']/div/header/div[1]/div/div/div/div[2]/div[1]/div/div/span"));

    public static Target errorMessage = Target
            .the("Error Message")
            .located(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[2]/span"));
}
