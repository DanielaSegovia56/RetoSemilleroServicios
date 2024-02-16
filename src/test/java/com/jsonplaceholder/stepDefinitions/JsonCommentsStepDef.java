package com.jsonplaceholder.stepDefinitions;

import com.jsonplaceholder.tasks.GetCommentsByIdTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;


public class JsonCommentsStepDef {

    Actor manage = Actor.named("manage")
            .whoCan(CallAnApi.at("https://jsonplaceholder.typicode.com"));

    @When("I consume the comments endpoint by ID")
    public void iConsumeTheCommentsEndpointByID() {
        manage.attemptsTo(
                GetCommentsByIdTask.getCommentsById()
        );

    }
    @Then("I will be able to view the comments available for the desired PostId")
    public void iWillBeAbleToViewTheCommentsAvailableForTheDesiredPostId() {
    }
}
