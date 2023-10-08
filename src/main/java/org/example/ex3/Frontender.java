package org.example.ex3;

public class Frontender extends Developer implements Frontentable{

    Frontender() {
        super();


    }
    @Override
    public void createFrontend() {
        codding();
        System.out.println("Frontend complete");
    }
}
