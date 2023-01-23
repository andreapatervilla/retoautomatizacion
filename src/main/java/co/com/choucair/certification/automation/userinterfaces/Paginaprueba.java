package co.com.choucair.certification.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.saucedemo.com/")
public class Paginaprueba extends PageObject {
    public static final Target TXT_USUARIO =Target.the("Ingresar usuario").located(By.id("user-name"));
    public static final Target TXT_CONTRASEÑA =Target.the("Ingresar contraseña").located(By.id("password"));
    public static final Target BTN_SING_IN =Target.the("Boton ingresar").located(By.id("login-button"));

    public static final Target BTN_MENU=Target.the("Botón de menú").located(By.id("menu_button_container"));
}
