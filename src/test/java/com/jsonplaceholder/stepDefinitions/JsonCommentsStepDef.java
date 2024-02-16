package com.jsonplaceholder.stepDefinitions;

import com.jsonplaceholder.questions.ResponseCommentsQuestion;
import com.jsonplaceholder.tasks.GetCommentsByIdTask;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class JsonCommentsStepDef {

    //Actor que se usará
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
        /*
        manage.should(
                seeThat(
                        "The email of comments is",
                        res -> new ResponseCommentsQuestion().answeredBy(manage).get(0).getEmail(),
                        equalTo("Presley.Mueller@myrl.com")
                )
        );

         */
    }
}
