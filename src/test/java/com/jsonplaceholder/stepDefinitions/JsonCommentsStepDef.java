package com.jsonplaceholder.stepDefinitions;

import com.jsonplaceholder.tasks.GetCommentsByIdTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.hasItems;


public class JsonCommentsStepDef {

    Actor manage = Actor.named("manage")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));

    @When("I consume the comments endpoint by {string}")
    public void iConsumeTheCommentsEndpointBy(String idPost) {
        manage.attemptsTo(
                GetCommentsByIdTask.getCommentsById(idPost)
        );
    }


    @Then("I will be able to view the comments available for the desired PostId")
    public void iWillBeAbleToViewTheCommentsAvailableForTheDesiredPostId() {

        manage.should(
                seeThatResponse("Email of commets is",
                        response -> response.body("email",
                                hasItems("Presley.Mueller@myrl.com",
                                        "Dallas@ole.me")))
        );


    }


}
