package org.example;
import org.example.draw.*;

import javax.swing.*;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Draw draw = new Draw();
        MyLine myLine = new MyLine(draw, 1, 2, 3, 4);
        MyCircle myCircle = new MyCircle(draw, 1, 2, 3);
        draw.myShapes.add(myLine);
        draw.myShapes.add(myCircle);
        System.out.println(draw);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(draw);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("output.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Draw draw1 =  (Draw) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            while(true){
                System.out.println(draw1);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}