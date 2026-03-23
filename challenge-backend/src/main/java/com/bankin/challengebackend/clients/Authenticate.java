package com.bankin.challengebackend.clients;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Authenticate {

    @JsonProperty("email")
    public String email;

    @JsonProperty("password")
    public String password;
}
