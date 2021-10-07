package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.SingUpUtestPage;

public class SingUp implements Task {
    private String strLabel;
    public static SingUp onThePage(String strLabel) {
        return Tasks.instrumented(SingUp.class, strLabel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SingUpUtestPage.LABEL_JOIN)
                );
    }
}
