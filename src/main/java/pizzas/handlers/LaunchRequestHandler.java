package pizzas.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import pizzas.PizzasStreamHandler;

import java.util.Optional;


public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Conoce alguna de las pizzas más populares del mundo. Pídemelo y te diré un tipo de pizza y sus ingredientes. Tan solo di: dime una pizza";
        return input.getResponseBuilder()
                .withSimpleCard(PizzasStreamHandler.SKILL_TITLE, speechText)
                .withSpeech(speechText)
                .withReprompt(speechText)
                .build();
    }
}
