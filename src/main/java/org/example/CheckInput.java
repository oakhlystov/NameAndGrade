package org.example;

public class CheckInput {
    public void checkInputCall(int points) {
        if (points > 100 || points < 0) {
            throw new IllegalStateException("Points should be between 0-100, but you entered: " + points);
        }
    }
}
