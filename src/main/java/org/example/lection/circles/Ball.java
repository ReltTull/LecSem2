package org.example.lection.circles;

import org.example.lection.common.MainCanvas;
import org.example.lection.common.Sprite;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite {
    private static final Random random = new Random();
    private final Color color;
    private float vX;
    private float vY;

    Ball() {
        halfHeight = (float) (Math.random() * 10f) + (float) (Math.random() * 40f);
        halfWidth = halfHeight;
        color = new Color(random.nextInt());
        vX = (float) (Math.random() * 10f) + (float) (Math.random() * 20f);
        vY = (float) (Math.random() * 10f) + (float) (Math.random() * 20f);
    }

    @Override
    public void render(MainCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(), (int) getTop(), (int) getWidth(), (int) getHeight());
    }

    @Override
    public void update(MainCanvas canvas, float deltaTime) {
        x += vX + deltaTime;
        y += vY + deltaTime;

        // если достигнута граница, т.е. координаты шарика выходят за границы, меняем направдение вектора
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setLeft(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setRight(canvas.getBottom());
            vY = -vY;
        }
    }
}
