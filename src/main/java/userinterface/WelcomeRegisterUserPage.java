package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomeRegisterUserPage extends PageObject {
    public static final Target MASSAGE_WELCOME = Target.the("Mensaje de bienvenida").located(By.xpath("//div[@class='container-block']//p[@class='welcome-lead']"));
}
