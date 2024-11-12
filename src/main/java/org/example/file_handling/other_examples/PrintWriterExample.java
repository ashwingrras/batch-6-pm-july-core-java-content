package org.example.file_handling.other_examples;

import java.io.PrintWriter;

public class PrintWriterExample
{
    public static void main(String[] args)
    {
        try {
            PrintWriter printWriter = new PrintWriter("src/main/java/test.txt");
            printWriter.write("Poornima ");
            printWriter.write(100);
            printWriter.write(", ");
            printWriter.println(100);
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
