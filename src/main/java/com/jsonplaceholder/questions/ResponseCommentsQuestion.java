package com.jsonplaceholder.questions;

import com.jsonplaceholder.models.ResponseCommentsModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Arrays;
import java.util.List;

public class ResponseCommentsQuestion implements Question<ResponseCommentsModel> {
    @Override
    public ResponseCommentsModel answeredBy(Actor actor) {
        return SerenityRest.lastResponse().jsonPath()
                .getObject("data",ResponseCommentsModel.class);
        //return Arrays.asList(SerenityRest.lastResponse().as(ResponseCommentsModel[].class));
    }

    /*
    public static ResponseCommentsQuestion all(){
        return new ResponseCommentsQuestion();
    }

     */
}
