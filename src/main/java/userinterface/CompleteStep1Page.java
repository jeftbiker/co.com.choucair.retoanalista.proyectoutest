package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteStep1Page {
    public static final net.serenitybdd.screenplay.targets.Target INPUT_FIRST_NAME = Target.the("Lleanr nombre")
            .located(By.id("firstName"));
    public static final net.serenitybdd.screenplay.targets.Target INPUT_LAST_NAME = Target.the("Lleanr nombre")
            .located(By.id("lastName"));
    public static final net.serenitybdd.screenplay.targets.Target INPUT_EMAIL_ADDRESS = Target.the("Lleanr nombre")
            .located(By.id("email"));
    public static final net.serenitybdd.screenplay.targets.Target SELECT_MONTH = Target.the("Lleanr nombre")
            .located(By.id("birthMonth"));
    public static final net.serenitybdd.screenplay.targets.Target SELECT_DAY = Target.the("Lleanr nombre")
            .located(By.id("birthDay"));
    public static final net.serenitybdd.screenplay.targets.Target SELECT_YEAR = Target.the("Lleanr nombre")
            .located(By.id("birthYear"));
    public static final net.serenitybdd.screenplay.targets.Target BUTTON_NEXT = Target.the("Lleanr nombre")
            .located(By.xpath("//div{@class='form-group col-xs-12 text-right'}//a[@class='btn btn-blue']//span(contains(text),'Next: Location')]"));

}
