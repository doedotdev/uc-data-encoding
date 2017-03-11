package com.data.structs;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	System.out.println("hello: how are you");
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("filename.txt"), "utf-8"))) {
            writer.write("something");
        } catch (IOException ex) {
            // report
        }
    }
}
