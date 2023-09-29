package io.dropwizard;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;
import io.dropwizard.resources.HelloWorld;

public class dropwizard_practice3Application extends Application<dropwizard_practice3Configuration> {

    public static void main(final String[] args) throws Exception {
        new dropwizard_practice3Application().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard_practice3";
    }

    @Override
    public void initialize(final Bootstrap<dropwizard_practice3Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dropwizard_practice3Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new HelloWorld());
    }

}
