/*
 * Java Standard Library Essentials
 * 
 * https://github.com/egalli64/jasl
 */
package com.example.jast.m3.s3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * A simple example of write/read bytes to/from file - try with resources
 */
public class BinaryStreamTry {
    private static final String FILENAME = "file.dat";

    public static void main(String[] args) {
        System.out.printf("Writing to %s: ", FILENAME);
        try (FileOutputStream fos = new FileOutputStream(FILENAME)) {
            for (byte b = 0; b < 10; b++) {
                System.out.print(b + " ");
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("done!");
        System.out.printf("Reading from %s: ", FILENAME);

        try (FileInputStream fis = new FileInputStream(FILENAME)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print(data + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("done!");
    }
}
