package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CompleteStep2Page;

public class CompleteStep2 implements Task {
    private String city;
    private String postalcode;
    private String country;
    public static CompleteStep2 data(String city, String postacode, String country) {
        return Tasks.instrumented(CompleteStep2.class);
    }

    public CompleteStep2(String city, String postacode) {
        this.city = city;
        this.postalcode = postacode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(city).into(CompleteStep2Page.INPUT_CITY),
        Enter.theValue(postalcode).into(CompleteStep2Page.INPUT_ZIP),
        Enter.theValue(country).into(CompleteStep2Page.SELECT_COUNTRY),
        Click.on(CompleteStep2Page.BUTTON_DEVICES)
        );
    }
}
