package com.atatarko;

public class Fence extends Structure {

    public Fence() {
        isBreakable = true;
    }

    @Override
    public String toString() {
        return "Fence{" +
               "isBreakable=" + isBreakable +
               '}';
    }

}
