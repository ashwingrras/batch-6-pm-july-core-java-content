package org.example.file_handling.other_examples;

import java.io.File;

public class FileHandlingExample
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("src/main/java/poornima-student-data.txt");
            //System.out.println(file.mkdirs());
            System.out.println(file.delete());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
