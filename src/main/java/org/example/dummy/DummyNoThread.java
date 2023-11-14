package org.example.dummy;

import java.util.Random;

public class DummyNoThread {
    public static void main(String[] args) {
        Random random = new Random();
        Dummy dummy1 = new Dummy(random.nextInt(10));
        dummy1.run();
        Dummy dummy2 = new Dummy(random.nextInt(10));
        dummy2.run();
    }
}
