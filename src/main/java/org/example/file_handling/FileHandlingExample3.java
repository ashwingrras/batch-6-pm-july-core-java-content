package org.example.file_handling;

import java.io.*;
import java.util.Arrays;

public class FileHandlingExample3
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream("vikash\\test.txt");
            byte[] chars = {'A', 'k'};
            fileOutputStream.write(chars);
            String name = "1, 2, 3, 4";
            fileOutputStream.write(name.getBytes());
            //PrintStream printStream = new PrintStream(System.out);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.print(", hello users ");
            printStream.print(", how are your ");


            FileInputStream fileInputStream = new FileInputStream("vikash\\test.txt");
            int data = fileInputStream.read();
            System.out.println(" data = "+ (char) data);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            System.out.println(Arrays.toString(bufferedInputStream.readAllBytes()));
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
