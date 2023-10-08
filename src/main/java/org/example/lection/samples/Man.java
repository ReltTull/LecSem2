package org.example.lection.samples;

public class Man implements Human{

    @Override
    public void walk() {
        System.out.println("Walks on two feet");
    }

    @Override
    public void talk() {
        System.out.println("Talks words. Sometimes they're have meaningful...");
    }
}
