package com.wiley.realworldjava.testing;

public class FirstRobot {

    private static final int MAX_WEIGHT = 125;

    private String name;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void addComponent(int componentWeight) {
        int newWeight = this.weight + componentWeight;
        if (newWeight > MAX_WEIGHT) {
            throw new IllegalArgumentException("Cannot add component. Robot would be too heavy");
        }
        this.weight = newWeight;
    }

    public int getWeight() {
        return weight;
    }
}
