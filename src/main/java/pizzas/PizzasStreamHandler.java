package pizzas;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import pizzas.handlers.CancelandStopIntentHandler;
import pizzas.handlers.HelpIntentHandler;
import pizzas.handlers.LaunchRequestHandler;
import pizzas.handlers.PizzaRequestHandler;
import pizzas.handlers.SessionEndedRequestHandler;

public class PizzasStreamHandler extends SkillStreamHandler {

    public static final String SKILL_TITLE = "Tipos de pizzas";

    private static Skill getSkill() {
        return Skills
                .standard()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new CancelandStopIntentHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        new PizzaRequestHandler()
                )
                .build();
    }

    public PizzasStreamHandler() {
        super(getSkill());
    }
}
