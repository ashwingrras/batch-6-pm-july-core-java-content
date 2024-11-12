package org.example.file_handling.other_examples;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWriterExample
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("src/main/java/test.txt");
            System.out.println((char) fileInputStream.read());
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            System.out.println((char) inputStreamReader.read());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
