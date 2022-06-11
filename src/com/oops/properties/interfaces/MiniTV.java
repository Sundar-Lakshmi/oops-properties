package com.oops.properties.interfaces;

public class MiniTV implements Media{
    @Override
    public void start() {
        System.out.println("Starts to play songs");
    }

    @Override
    public void stop() {
        System.out.println("Stops the player");
    }
}
