package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pages.FlipkartHomePage;

/**
 * Created by ankit.vaish on 09-01-2018.
 */
public class FlipkartSalutationText implements Question{
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FlipkartHomePage.salutationLabel).viewedBy(actor).asString();
    }

    public static FlipkartSalutationText displayed(){
        return new FlipkartSalutationText();
    }
}
