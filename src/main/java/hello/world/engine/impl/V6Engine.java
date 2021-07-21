package hello.world.engine.impl;

import hello.world.engine.interfaces.Engine;

import javax.inject.Singleton;

@Singleton
public class V6Engine implements Engine {

    private int cylinders;

    @Override
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String start() {
        return "Starting V6";
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
