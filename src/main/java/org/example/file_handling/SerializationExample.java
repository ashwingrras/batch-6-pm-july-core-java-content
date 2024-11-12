package org.example.file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample
{
    public static void main(String[] args)
    {
        {
            try
            {
                //serialization
                Student student1 = new Student(101,"Harshit",20);
                Student student2 = new Student(102,"Devesh",20);
                Student student3 = new Student(103,"Yogam",20);
                Student student4 = new Student(104,"Ansh",20);
                Student student5 = new Student(105,"Lalit",20);
                Student student6 = new Student(106,"Himani",20);
                Student student7 = new Student(107,"Nandini",20);
                FileOutputStream fos = new FileOutputStream("vikash/serialize_file.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(student1);
                oos.writeObject(student2);
                oos.writeObject(student3);
                oos.writeObject(student4);
                oos.writeObject(student5);
                oos.writeObject(student6);
                oos.writeObject(student7);
                oos.flush();
                oos.close();
                fos.close();
                System.out.println("Serialization success");
                
                //DeSerialization
                FileInputStream fis = new FileInputStream("vikash/serialize_file.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);
                while(true)
                {
                    try
                    {
                        Student studentRead1 = (Student) ois.readObject();
                        if(null != studentRead1)
                        {
                            System.out.println("deserialize student : "+studentRead1.name+", rollNo : "+studentRead1.rollNo);
                        }
                        else
                        {
                            break;
                        }
                    }
                    catch (Exception e)
                    {
                        break;
                    }
                }
                ois.close();
                System.out.println("DeSerialization success");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

