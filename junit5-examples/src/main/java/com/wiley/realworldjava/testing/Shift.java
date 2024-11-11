package com.wiley.realworldjava.testing;

public final class Shift {

    public static record Coords(int x, int y){

    }

    public static Coords moveUp(Coords original) {
        return new Coords(original.x, original.y + 1);
    }
    public static Coords moveDown(Coords original) {
        return new Coords(original.x, original.y - 1);
    }
}
