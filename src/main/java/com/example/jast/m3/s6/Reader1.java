/*
 * Java Standard Library Essentials
 * 
 * https://github.com/egalli64/jasl
 */
package com.example.jast.m3.s6;

import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reader1 {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    public static void main(String[] args) {
        try (FileReader fr = new FileReader(FILE_NAME)) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't read from " + FILE_NAME, e);
        }
    }
}
