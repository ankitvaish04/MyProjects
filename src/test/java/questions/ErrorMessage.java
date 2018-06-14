package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pages.FlipkartHomePage;

/**
 * Created by ankit.vaish on 09-01-2018.
 */
public class ErrorMessage implements Question{
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FlipkartHomePage.errorMessage).viewedBy(actor).asString();
    }

    public static ErrorMessage displayed(){
        return new ErrorMessage();
    }
}
