package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CompleteStep3Page;
import userinterface.CompleteStep4Page;

public class CompleteStep4  implements Task {
    private String password;
    private String passwordconfirm;


    public CompleteStep4(String password, String passwordconfirm) {
        this.password = password;
        this.passwordconfirm = passwordconfirm;

    }

    public static CompleteStep4 data(String password, String passwordconfirm) {
        return Tasks.instrumented(CompleteStep4.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(password).into(CompleteStep4Page.INPUT_PASS),
                Enter.theValue(passwordconfirm).into(CompleteStep4Page.INPUT_CONFRIMPASS),
                Click.on(CompleteStep4Page.CHECK_TERMS),
                Click.on(CompleteStep4Page.CHECK_PRIVACY),
                Click.on(CompleteStep4Page.BUTTON_LAST_STEP)
        );
    }
}
