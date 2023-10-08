package org.example.seminar;

import org.example.seminar.serverOperationsInterfaces.Connectable;

import javax.swing.*;

public class ChatServer implements Connectable {
    boolean status;

    ChatServer() {
        this.status = false;
    }

    @Override
    public void conneсt(JTextArea areaJournal) {
        this.status = true;
        areaJournal.append("Server status is - " + status  + "\n");
    }

    @Override
    public void disconnect(JTextArea areaJournal) {
        if (!status) {
            areaJournal.append("Server status is already " + status + "\n");
        } else {
            this.status = false;
            areaJournal.append("Server status is - " + status + "\n");
        }
    }
}
