package com.wiley.realworldjava.testing;

public final class Match {

    private int number;
    public int points;

    public Match(int number) {
        this.number = number;
    }

    public void setWin() {
        points+=2;
    }

    public void setTie() {
        points+=1;
    }

    public String getFormatted() {
        String result = "";
        if (number == 0) {
            result = "n/a";
        } else {
            result = "Match %d, Score: %d".formatted(number, points);
        }
        return result;
    }
}
