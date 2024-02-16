package com.jsonplaceholder.models;


import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCommentsModel {

    public Integer postId;
    public Integer id;
    public String name;
    public String email;
    public String body;

}
