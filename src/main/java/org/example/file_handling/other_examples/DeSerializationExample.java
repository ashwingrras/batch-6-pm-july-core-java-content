package org.example.file_handling.other_examples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationExample
{
    public static void main(String[] args)
    {
        {
            try
            {
                //DeSerialization
                FileInputStream fis = new FileInputStream("devesh/serializable.ser");
                ObjectInputStream ois = new ObjectInputStream(fis);
                Student student = (Student) ois.readObject();
                System.out.println(student.name);
                ois.close();
                System.out.println("DeSerialization success");
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
