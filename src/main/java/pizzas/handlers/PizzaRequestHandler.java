package pizzas.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;
import pizzas.Pizza;
import pizzas.PizzaService;
import pizzas.PizzasStreamHandler;

import java.util.Optional;

public class PizzaRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.intentName("PizzaIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Pizza q = PizzaService.randomPizza();
        System.out.println("Pizza -> " + q);

        String speechText = "Pizza \"" + q.getName() + "\": \"" + q.getDescription() + "\".";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(PizzasStreamHandler.SKILL_TITLE, speechText)
                .withShouldEndSession(true)
                .build();
    }
}
