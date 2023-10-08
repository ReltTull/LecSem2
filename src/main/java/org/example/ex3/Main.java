package org.example.ex3;

import org.example.ex3.Developer;
import org.example.ex3.Frontender;
import org.example.lection.circles.MainWindow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Frontender();
        Developer front = new Frontender();
        Developer backer = new Backender();

        List<Developer> team = new ArrayList<>();
        team.add(dev);
        team.add(front);
        team.add(backer);
        for (Developer d: team) {
            if (d instanceof Backendable) {
                ((Backendable) d).createBackend();
            }
        }
    }

}