package org.example.file_handling;

import java.io.*;

public class FileHandlingExample2
{
    public static void main(String[] args)
    {
        Reader reader = null;
        try {
            reader = new FileReader("vikash\\test.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            /*int data = reader.read();
            while (data != -1)
            {
                //System.out.println("data "+data);
                //System.out.println((char) data);
                data = reader.read();
            }*/
            String dataBuffer = bufferedReader.readLine();
            System.out.println("dataBuffer "+dataBuffer);

            FileWriter fileWriter = new FileWriter("vikash\\test.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("manoj");
            bufferedWriter.write(", abhishek");
            bufferedWriter.flush();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
