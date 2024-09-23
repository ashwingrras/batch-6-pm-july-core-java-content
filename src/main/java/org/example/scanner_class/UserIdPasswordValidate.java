package org.example.scanner_class;

import java.util.Scanner;

public class UserIdPasswordValidate
{
    //
    static String userName1 = "ashwin";
    static String userName2 = "vakul";
    static String userName3 = "rohit";
    static String userName4 = "kartik";
    static String password1 = "12345";
    static String password2 = "123321";
    static String password3 = "654321";
    static String password4 = "321123";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // 5
        // -5
        System.out.println("please enter your user name");
        int a = Integer.parseInt("55");
        System.out.println(a);
        String userName = scanner.next();
        String password = null;
        if(userName.equals(userName1))
        {
            password = password1;
        }
        else if(userName.equals(userName2))
        {
            password = password2;
        }
        else if(userName.equals(userName3))
        {
            password = password3;
        }
        else if(userName.equals(userName4))
        {
            password = password4;
        }
        else
        {
            System.out.println("user not found");
        }
        if(password != null)
        {
            //
            System.out.println("please enter your password");
            int wrongCount = 0;
            while(scanner.hasNext())
            {
                String userEnteredPassword = scanner.next();
                if(userEnteredPassword.equals(password))
                {
                    System.out.println("login success");
                    break;
                }
                else
                {
                    wrongCount++;
                    System.out.println("wrong password count: "+wrongCount);
                }
                if(wrongCount > 3)
                {
                    System.out.println(" you have entered wrong password more than 3 times");
                    break;
                }
            }
        }
    }
}
