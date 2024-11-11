package org.example.file_handling;

import java.io.*;
import java.util.Scanner;

//

/*
        1. Reader
        2. Writer
        3. FileReader
        4. FileWriter
        5. BufferReader
        6. BufferWriter
        7. PrintStream
        8. FileInputStream
        9. FileOutputStream


 */

public class  FileHandlingExample1
{
    public static void main(String[] args)
    {
        Scanner scanner = null;
        try
        {
            scanner = new Scanner(new File("vakul\\vakul.txt"));
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("scanner value "+scanner.next());
        // D:\batch-6-pm-july-core-java-content\src\main\java\org\example\file_handling\vakul.txt
        File file = new File("vakul\\vakul.txt");
        try
        {
            System.out.println(file.createNewFile());
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        //System.out.println(file.mkdir());
        Writer w = null;
        try
        {
            w = new FileWriter("vakul\\testfile.txt",false);
            String content = "";
            w.write(content);
            w.flush();
            w.write("");
            for(int i = 0; i < 256; i++)
            {
                w.write(i);
            }
            w.flush();
            //w.close();
            System.out.println("write Done");
            Reader reader = new FileReader("vakul\\testfile.txt");
            int data = reader.read();
            while (data != -1)
            {
                //System.out.println("data "+data);
                //System.out.println((char) data);
                data = reader.read();
            }
            for(int i = 0; i < 256; i++)
            {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        ////
        File file1 = new File("vikash");
        if(file1.mkdir())
        {
            file1 = new File("vikash/test.txt");
        }
        try
        {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
