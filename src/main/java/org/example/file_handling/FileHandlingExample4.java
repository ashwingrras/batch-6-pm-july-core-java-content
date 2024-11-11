package org.example.file_handling;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileHandlingExample4
{
    public static void main(String[] args)
    {
        try {
            FileOutputStream fileOutputStream1 = new FileOutputStream("vikash\\test.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("vikash\\test2.txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = "this is test data";
            byteArrayOutputStream.write(str.getBytes());

            byteArrayOutputStream.writeTo(fileOutputStream1);
            byteArrayOutputStream.writeTo(fileOutputStream2);
            //byteArrayOutputStream.flush();

            FileOutputStream fileOutputStream3=new FileOutputStream("vikash\\test_new.txt");
            fileOutputStream3.write(byteArrayOutputStream.toByteArray());
            fileOutputStream3.close();


            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            String value = "aman";
            byteArrayOutputStream1.write(value.getBytes());

            byte[] bytes = byteArrayOutputStream1.toString().getBytes();
            String values = new String(bytes);
            System.out.println(" values "+values);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
