package pizzas.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import pizzas.PizzasStreamHandler;

import java.util.Optional;

public class CancelandStopIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(
                intentName("AMAZON.StopIntent")
                        .or(intentName("AMAZON.CancelIntent"))
                        .or(intentName("AMAZON.NoIntent"))
        );
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        return input.getResponseBuilder()
                .withSpeech("Adiós")
                .withSimpleCard(PizzasStreamHandler.SKILL_TITLE, "Adiós")
                .withShouldEndSession(true)
                .build();
    }
}
