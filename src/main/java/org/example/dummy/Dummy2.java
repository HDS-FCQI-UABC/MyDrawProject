package org.example.dummy;
import java.lang.Thread;

public class Dummy2 extends Thread{
    private int x;

    public Dummy2(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void run() {
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
