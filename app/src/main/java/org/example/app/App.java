package org.example.app;

import main.java.org.example.hashmap.HashMap;

import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        try {
            System.setOut(
                new PrintStream(
                    Files.newOutputStream(Path.of("out.txt")),  // системныйвывод -> "out.txt"
                    true
                )
            );
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            return;
        }

        HashMap<String, String> contacts = new HashMap();
        contacts.put("Alex", "8(800)555 35 35");
        contacts.put("Ivan", "7(777)777 77 77");
        System.out.println("Ivan: " + contacts.get("Ivan"));
        contacts.put("Ivan", "222222222222222");
        
        System.out.println("Alex: " + contacts.get("Alex"));
        System.out.println("Ivan: " + contacts.get("Ivan"));

        contacts.remove("Alex");
        contacts.remove("Ivan");
        System.out.println("Alex: " + contacts.get("Alex"));
        System.out.println("Ivan: " + contacts.get("Ivan"));
    }
}
