package co.com.choucair.certification.automation.stepdefinitions;

import co.com.choucair.certification.automation.questions.Verificar;
import co.com.choucair.certification.automation.tasks.AbrirPagina;
import co.com.choucair.certification.automation.tasks.Ingresar;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.jsoup.select.Evaluator;

public class SaucemoStepDefinitions {
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("que Andrea ingresa a la pagina saucedemo")
    public void queAndreaIngresaALaPaginaSaucedemo() {
OnStage.theActorCalled("Andrea").wasAbleTo(AbrirPagina.urlpagina());
    }
    @When("digita sus credenciales e ingresa a la pagina")
    public void digitaSusCredencialesEIngresaALaPagina() throws InterruptedException {
OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());

    }
    @Then("verifica que pudo ingresar correctamente")
    public void verificaQuePudoIngresarCorrectamente() {
OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("Open Menu")));
    }
}
