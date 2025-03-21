/*
 * Java Standard Library Essentials
 * 
 * https://github.com/egalli64/jasl
 */
package com.example.jast.m3.s6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reading from File
 */
public class Reader2Buffered {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * BufferedReader, FileReader
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = br.readLine();
            System.out.println(">" + line + "<");

            System.out.println("***");
            int cur;
            while ((cur = br.read()) != -1) {
                char c = (char) cur;
                if (c == '\n') {
                    System.out.println();
                } else if (c != '\r') {
                    System.out.print("_");
                    System.out.print(c);
                    System.out.print("_");
                }
            }
            System.out.println();

            log.info("Done reading from " + FILE_NAME);
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't read from " + FILE_NAME, e);
        }
    }
}
