package org.example.lection.common;

import java.awt.*;

public interface Interactable {
    void update(MainCanvas canvas, float deltaTime);
    void render(MainCanvas canvas, Graphics g);
}
