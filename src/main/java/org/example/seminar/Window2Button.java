package org.example.seminar;

import org.example.seminar.serverOperationsInterfaces.Connectable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window2Button extends JFrame {
    private static final int WINDOW_HEIGHT = 400;
    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_POSX = 700;
    private static final int WINDOW_POSY = 200;

    ChatServer chatServer = new ChatServer();
    /**
     * текстовое поле журнала
     */
    JTextArea areaJournal = new JTextArea();

    Window2Button() {
        JButton btnStart = new JButton("Start");
        JButton btnStop = new JButton("Stop");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server interface");
        setResizable(false);
        JPanel panButton = new JPanel(new GridLayout(1, 1));
        areaJournal.setBackground(Color.GRAY);
        areaJournal.setEditable(false);
        // JScrollPane для JTextArea добавляет возможность прокуртки
        JScrollPane scrollPane = new JScrollPane(areaJournal);
        // Добавляем JTextArea (или JScrollPane) на панель
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);

        panButton.add(btnStart);
        panButton.add(btnStop);

        add(panButton, BorderLayout.NORTH);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatServer.conneсt(areaJournal);
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chatServer.disconnect(areaJournal);
            }
        });
    }

    /**
     * метод для записи сообщения в журнал
     * @param message
     */
    public void writeInJournal (String message) {
        areaJournal.append(message + "\n");
    };

}


