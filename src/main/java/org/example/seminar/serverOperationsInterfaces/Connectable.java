package org.example.seminar.serverOperationsInterfaces;

import org.example.seminar.ChatServer;

import javax.swing.*;

public interface Connectable {
    void conneсt(JTextArea areaJournal);
    void disconnect(JTextArea areaJournal);
}
