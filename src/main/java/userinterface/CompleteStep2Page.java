package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteStep2Page {
    public static final Target INPUT_CITY = Target.the("ingresar tu ciudad").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("ingresar tu ciudad").located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("ingresar tu ciudad").located(By.xpath("//div[@class='ui-select-match']//span[@class='ui-select-match-text pull left']//input[@class='form-control ui-select-search ng-pristine ng-valide ng-empty ng-touched']"));
    public static final Target BUTTON_DEVICES = Target.the("ingresar tu ciudad").located(By.xpath("//div[@class='pull--right next-step']//a[@class='btn btn-blue pull right']"));

}
