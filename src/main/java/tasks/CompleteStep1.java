package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CompleteStep1Page;

public class CompleteStep1 implements Task {
        private String fname;
        private String lname;
        private String email;
    public static CompleteStep1 data(String fname, String lname, String email) {
        return Tasks.instrumented(CompleteStep1.class);
    }

    public CompleteStep1(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(fname).into(CompleteStep1Page.INPUT_FIRST_NAME),
                Enter.theValue(lname).into(CompleteStep1Page.INPUT_LAST_NAME),
                Enter.theValue(email).into(CompleteStep1Page.INPUT_EMAIL_ADDRESS),
                Click.on(CompleteStep1Page.SELECT_MONTH),
                Click.on(CompleteStep1Page.SELECT_DAY),
                Click.on(CompleteStep1Page.SELECT_YEAR),
                Click.on(CompleteStep1Page.BUTTON_NEXT)
        );
    }
}
