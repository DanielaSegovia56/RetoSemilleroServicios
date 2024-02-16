package com.jsonplaceholder.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.hasItems;

public class GetCommentsByIdTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource("/comments")
                        .with(
                                request -> request
                                        .queryParam("postId", 2))
        );

        actor.should(
                seeThatResponse("Email of commets is",
                        response -> response.body("email",
                                hasItems("Presley.Mueller@myrl.com",
                                        "Dallas@ole.me")))
        );

    }

    public static GetCommentsByIdTask getCommentsById(){
        return instrumented(GetCommentsByIdTask.class);
    }
}
