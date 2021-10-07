package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteStep4Page {
    public static final Target INPUT_PASS = Target.the("poner la cintraseña que escogiste").located(By.id("password"));
    public static final Target INPUT_CONFRIMPASS = Target.the("confirmar la contraseña").located(By.id("confirmPassword"));
    public static final Target BUTTON_LAST_STEP = Target.the("boton que finaliza el registro").located(By.xpath("//div[@class='pull-right next step']//a[@id='laddaBtn']//span[contains(text(),'Complete Setup']"));
    public static final Target CHECK_TERMS = Target.the("marca la aceptacion de terminos y condiciones").located(By.id("termOfuse"));
    public static final Target CHECK_PRIVACY = Target.the("marca la aceptacion de politicas de privacidad").located(By.id("privacySetting"));
}
