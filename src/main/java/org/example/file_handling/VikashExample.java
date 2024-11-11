package org.example.file_handling;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class VikashExample
{
    public static void main(String[] args)
    {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        int input= 0;
        try
        {
            // D:\batch-6-pm-july-core-java-content
            input = inputStreamReader.read();
            while (input != -1)
            {
                System.out.println((char)input);
                input=inputStreamReader.read();
            }
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
