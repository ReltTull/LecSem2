package org.example.lection.common;

import org.example.lection.circles.Ball;
import org.example.lection.circles.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainCanvas extends JPanel implements MouseListener {
    private final CanvasRepaintListener controller; // связываем с окном, на котором объект класса находится
    private long lastFrameTime;
    public MainCanvas(CanvasRepaintListener controller) {
        this.controller = controller;
        lastFrameTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Thread.sleep(16 );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        float deltaTime = (System.nanoTime() - lastFrameTime) * 0.000000001f;
        controller.onDrawFrame(this, g, deltaTime);
        lastFrameTime = System.nanoTime();
        repaint();
    }

    public int getLeft() {
        return 0;
    }
    public int getRight() {
        return getWidth() - 1;
    }
    public int getTop() {
        return 0;
    }
    public int getBottom() {
        return getHeight() - 1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
