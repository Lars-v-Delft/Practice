package io.dropwizard.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello")
public class HelloWorld {

    @GET
    public String myTest(){
        return "hello world";
    }

}
