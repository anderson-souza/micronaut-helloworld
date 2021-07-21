package hello.world;

import hello.world.models.Hello;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("/hello")
public interface HelloClient {

    @Get("/world-object")
    Hello helloWorldObject();

    @Get(processes = MediaType.TEXT_PLAIN)
    String hello();

    @Get(value = "/world", processes = MediaType.TEXT_PLAIN)
    String helloWorld();

}
