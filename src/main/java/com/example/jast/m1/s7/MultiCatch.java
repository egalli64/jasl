/*
 * Java Standard Library Essentials
 * 
 * https://github.com/egalli64/jasl
 */
package com.example.jast.m1.s7;

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            switch (args.length) {
            case 0 -> throw new SQLException();
            case 1 -> throw new IOException();
            default -> throw new Exception();
            }
        } catch (IOException | SQLException ex) {
            System.out.println("RDBMS/IO problem: " + ex);
        } catch (Exception ex) {
            System.out.println("Some problem: " + ex);
        }
    }
}
