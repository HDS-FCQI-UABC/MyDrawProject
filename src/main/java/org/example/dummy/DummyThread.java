package org.example.dummy;

import java.util.Random;

public class DummyThread {
    public static void main(String[] args) {
        Random random = new Random();
        Dummy2 dummy1 = new Dummy2(random.nextInt(10));
        dummy1.start();
        Dummy2 dummy2 = new Dummy2(random.nextInt(10));
        dummy2.start();
    }

}

