package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompleteStep3Page {
    public static final Target SELECT_OSPC = Target.the("Selecciona el sistema operativo de tu pc")
            .located(By.xpath("//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']//input[@class='form-control ui-select-search ng-valid ng-touched nd-dirty ng-empty']"));
    public static final Target SELECT_VERSION = Target.the("selecciona la version del SO").located(By.xpath("//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target SELECT_LANGUAGE = Target.the("selecciona el lengiuaje").located(By.xpath("//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target SELECT_MOBILE = Target.the("Seleciona la marca de tu movil").located(By.xpath("//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target SELECT_MODELMOBILE = Target.the("selecciona el modelo de tu movil").located(By.xpath("//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target SELECT_OSMOBILE = Target.the("selecciona el SO de tu movil").located(By.xpath("//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target BUTTON_LAST_STEP = Target.the("selecciona el SO de tu movil").located(By.xpath("//div[@class='ui-select-match']//span[@class='btn btn-default form-control ui-select-toggle']"));

}
