package hello.world.engine.impl;

import hello.world.engine.interfaces.Engine;
import hello.world.engine.interfaces.V8;

import javax.inject.Singleton;

@Singleton
public class Vehicle {

    private final Engine engine;

    public Vehicle(@V8 Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }

}
