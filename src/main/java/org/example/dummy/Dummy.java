package org.example.dummy;

import java.util.Random;

public class Dummy {
    private int x;

    public Dummy(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void run(){
        for(int i = 0; i < this.x; i++){
            System.out.println("i" + this.x + " = " + i);
        }
        System.out.println("Termine! i" + this.x);
    }

    @Override
    public String toString() {
        return "Dummy(x=" + this.x + ")";
    }
}
