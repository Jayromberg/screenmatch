package br.com.screenmatch.calculator;

import br.com.screenmatch.models.Datasheet;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void add(Datasheet d) {
        this.totalTime += d.getDurationInMinutes();
    }
}
