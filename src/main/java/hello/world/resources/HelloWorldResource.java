package hello.world.resources;

import hello.world.engine.impl.Vehicle;
import hello.world.models.Hello;
import hello.world.services.HelloService;
import io.micronaut.context.BeanContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/hello")
public class HelloWorldResource {

    private final HelloService helloService;

    public HelloWorldResource(HelloService helloService) {
        this.helloService = helloService;
    }

    @Get(produces = MediaType.TEXT_PLAIN)
    public String hello() {
        final BeanContext context = BeanContext.run();
        Vehicle vehicle = context.getBean(Vehicle.class);
        return vehicle.start();
    }

    @Get(produces = MediaType.TEXT_PLAIN, value = "/world")
    public String helloWorld() {
        return "Hello World";
    }

    @Get("/world-object")
    public Hello helloWorldObject() {
        return helloService.helloWorldObject();
    }

}
