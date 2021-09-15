package com.serrodcal;

import javax.inject.Singleton;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.Route.HttpMethod;
import io.smallrye.mutiny.Uni;

@Singleton
public class GreetingResource {

    @Route(path = "/hello", methods = HttpMethod.GET, produces = "text/plain")
    public Uni<String> hello() {
        return Uni.createFrom().item("Hello");
    }

}