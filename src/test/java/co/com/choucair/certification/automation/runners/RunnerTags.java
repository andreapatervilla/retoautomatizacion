package co.com.choucair.certification.automation.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/prueba.feature",
        tags = "@HistoriaDeUsuario",
        glue ="co.com.choucair.certification.automation.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )


public class RunnerTags {

}
