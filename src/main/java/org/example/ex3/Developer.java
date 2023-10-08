package org.example.ex3;

import java.util.List;

public abstract class Developer {
    private List<String> languages; // список языков программирования, которыми условно владеет дев
    private List<String> frameworks; // список фреймворков, которыми условно владеет дев

    Developer() {}
    Developer(List<String> langs, List<String> frames) {
        this.languages = langs;
        this.frameworks = frames;
    }
    void codding() {
        System.out.println("clatz-clatz");
    };
}
