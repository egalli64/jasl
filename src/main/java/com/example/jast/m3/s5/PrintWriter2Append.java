/*
 * Java Standard Library Essentials
 * 
 * https://github.com/egalli64/jasl
 */
package com.example.jast.m3.s5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Writing to File by PrintWriter
 */
public class PrintWriter2Append {
    private static final Logger log = Logger.getGlobal();
    private static final String FILE_NAME = "/tmp/hello.txt";

    /**
     * Create a FileOutputStream, wrap it in a PrintWriter, so to use its handy
     * methods: print(), println(), append()
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(FILE_NAME, true))) {
            pw.print("More ");
            pw.println("hello!");
            pw.append("Hello again!");
            log.info("Append to " + FILE_NAME + " done");
        } catch (IOException e) {
            log.log(Level.SEVERE, "Can't append to " + FILE_NAME, e);
        }
    }
}
