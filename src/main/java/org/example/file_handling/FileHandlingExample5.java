package org.example.file_handling;

import java.io.*;

public class FileHandlingExample5
{
    public static void main(String[] args)
    {
        try {
            /*FileOutputStream file = new FileOutputStream("vikash\\abc.txt");
            DataOutputStream data = new DataOutputStream(file);
            data.writeInt(65);
            data.writeBoolean(false);
            data.writeFloat(10.5f);
            data.flush();
            data.close();*/


            FileInputStream input = new FileInputStream("vikash\\abc.txt");
            DataInputStream inst = new DataInputStream(input);
            int count = input.available();
            byte[] ary = new byte[count];
            inst.read(ary);
            System.out.println(" now reading file ");
            for (byte bt : ary)
            {
                char k = (char) bt;
                System.out.print(k+"-");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
