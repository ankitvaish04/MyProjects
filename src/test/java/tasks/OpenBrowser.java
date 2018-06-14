package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pages.FlipkartDefaultPage;

public class OpenBrowser implements Task {
    FlipkartDefaultPage flipkartDefaultPage;

    public static OpenBrowser withDefaultURL() {
        return new OpenBrowser();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(flipkartDefaultPage));
    }

}
