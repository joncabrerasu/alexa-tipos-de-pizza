package pizzas.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;
import pizzas.PizzasStreamHandler;

import java.util.Optional;

public class SessionEndedRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(SessionEndedRequest.class));
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
