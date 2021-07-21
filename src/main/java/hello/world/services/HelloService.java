package hello.world.services;

import hello.world.configurations.HelloConfiguration;
import hello.world.models.Hello;

import javax.inject.Singleton;

@Singleton
public class HelloService {

    private final HelloConfiguration helloConfiguration;

    public HelloService(HelloConfiguration helloConfiguration) {
        this.helloConfiguration = helloConfiguration;
    }

    public Hello helloWorldObject() {

        Hello hello = new Hello();
        hello.setText(helloConfiguration.getStem() + " World");
        return hello;
    }
}
