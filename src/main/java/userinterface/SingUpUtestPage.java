package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class SingUpUtestPage {
    public static final Target LABEL_JOIN = Target.the("Label that let enter to singup user")
            .located(org.openqa.selenium.By.xpath("//div[@class='unauthenticated-nav-bar_links-right hidden-sm hidden-xs']//a[@class='unauthenticated-nav-bar_sing-up']"));

}
