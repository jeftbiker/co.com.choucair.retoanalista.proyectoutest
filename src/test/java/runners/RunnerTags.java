package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Carateristicas.feature",
        tags = "@stories",
        glue = "co.com.choucair.retoanalista.proyectoutest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
