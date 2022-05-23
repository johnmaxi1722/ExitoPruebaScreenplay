package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Entrega"
)

public class SelTipoEntregaRunner {


}
