import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login"},
        glue     = {"stepdefinitions/Login"},
        junit    = {"--filename-compatible-names"},
        plugin   = {"pretty", "html:target/site/user_login"}
)
public class user_login {

}