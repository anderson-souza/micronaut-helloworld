package hello.world.resources;

import hello.world.HelloClient;
import hello.world.models.Hello;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class HelloWorldResourceTest {

    @Inject
    HelloClient client;

    @Test
    void hello() {
        String result = client.hello();

        Assertions.assertEquals("Starting V8", result);
    }

    @Test
    void helloWorld() {
        String result = client.helloWorld();

        Assertions.assertEquals("Hello World", result);
    }

    @Test
    void helloWorldObject() {
        Hello result = client.helloWorldObject();

        Assertions.assertEquals("Hello World", result.getText());
    }
}