package com.oops.properties.interfaces;

public class JaguarCar {
    private Engine engine = new PowerEngine();
    private Media media = new MiniTV();


    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void start() {
        media.start();
    }

    public void stop(){
        media.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
        engine.start();
    }
}
