package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CompleteStep3Page;

public class CompleteStep3 implements Task {
    private String pcOS;
    private String pcVersion;
    private String pcLenguagen;
    private String Mobile;
    private String mobileModel;
    private String mobileOs;

    public CompleteStep3(String pcOS, String pcVersion, String pcLenguagen, String mobile, String mobileModel, String mobileOs) {
        this.pcOS = pcOS;
        this.pcVersion = pcVersion;
        this.pcLenguagen = pcLenguagen;
        Mobile = mobile;
        this.mobileModel = mobileModel;
        this.mobileOs = mobileOs;
    }

    public static CompleteStep3 data(String pcOS, String pcVersion, String pcLenguagen, String mobile, String mobileModel, String mobileOs) {
        return Tasks.instrumented(CompleteStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Click.on(CompleteStep3Page.SELECT_OSPC),
                Enter.theValue(pcOS).into(CompleteStep3Page.SELECT_VERSION),
                Enter.theValue(pcVersion).into(CompleteStep3Page.SELECT_LANGUAGE),
                Enter.theValue(pcLenguagen).into(CompleteStep3Page.SELECT_MOBILE),
                Enter.theValue(Mobile).into(CompleteStep3Page.SELECT_MODELMOBILE),
                Enter.theValue(mobileModel).into(CompleteStep3Page.SELECT_OSMOBILE),
                Click.on(CompleteStep3Page.BUTTON_LAST_STEP)

        );
    }
}
