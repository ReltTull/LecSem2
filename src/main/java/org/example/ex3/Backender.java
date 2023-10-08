package org.example.ex3;

public class Backender extends Developer implements Backendable {
    @Override
    public void createBackend() {
        System.out.println("klatz-klatz");
    }
}
