package pizzas.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import pizzas.PizzasStreamHandler;

import java.util.Optional;

public class HelpIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Para conocer alguna de las pizzas más populares del mundo y sus ingredientes tan solo di: dime una pizza";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(PizzasStreamHandler.SKILL_TITLE, speechText)
                .withReprompt(speechText)
                .build();
    }
}
