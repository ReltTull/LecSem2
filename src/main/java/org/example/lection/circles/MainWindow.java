package org.example.lection.circles;

import org.example.lection.common.CanvasRepaintListener;
import org.example.lection.common.Interactable;
import org.example.lection.common.MainCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainWindow extends JFrame implements CanvasRepaintListener {
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private final Interactable[] interactables = new Interactable[10];
    public MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");

        interactables[0] = new Background();
        for (int i = 1; i < interactables.length; i++) {
            interactables[i] = new Ball();
        }

        MainCanvas canvas = new MainCanvas(this);
        add(canvas);
        setVisible(true);
    }

//    private java.util.List<Interactable> interactables = new java.util.ArrayList<>();
//    public MainWindow() {
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
//        setTitle("Circles");
//        JPanel interactablesPanel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                for (int i = 0; i < interactables.size(); i++) {
//                    interactables.add(new Ball());
//
//                }
//            }
//        };
//    }

    /**
     * метод для бизнес логики
     */
    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }
    private void update(MainCanvas canvas, float deltaTime) {
        for (int i = 0; i < interactables.length; i++) {
            interactables[i].update(canvas, deltaTime);
        }
    }
    private void render(MainCanvas canvas, Graphics g) {
        for (int i = 0; i < interactables.length; i++) {
            interactables[i].render(canvas, g);
        }
    }

//    @Override
//    public void onDrawFrame(MainCanvas canvas, Graphics g) {
//
//    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
