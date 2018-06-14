package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebElement;

import static pages.FlipkartDefaultPage.LOGIN_BUTTON;
import static pages.FlipkartDefaultPage.PASSWORD;
import static pages.FlipkartDefaultPage.USER_NAME;

public class Login implements Task {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username; this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USER_NAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }

    public static Login with(String username, String password) {
        return Instrumented.instanceOf(Login.class).withProperties(username, password);
    }
}
