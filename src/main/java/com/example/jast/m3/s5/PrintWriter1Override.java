/*
 * Java Standard Library Essentials
 * 
 * https://github.com/egalli64/jasl
 */
package com.example.jast.m3.s5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Writing to File by PrintWriter
 */
public class PrintWriter1Override {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * Create a PrintWriter directly from the filename
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(FILE_NAME)) {
            pw.print("Hello, ");
            pw.println("hello!");
            pw.append("Hello again!");
            log.info("Write to " + FILE_NAME + " done");
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't write to " + FILE_NAME, e);
        }
    }
}
