package org.example.control_statement;/*

    control structure
    1. if()
    2. else, if else
    3. nested if else
    4. else if()
    5. switch

    jump statement;
    1. break  : switch & loops
    2. continue  : only loops

    Looping statement:
    1. for
    2. while
    3. do while
    4. enchanced for

 */


public class ControlStatement 
{
  public static void main(String[] args) 
  {

    // normal if & else
    int a = 10;
    int b = 15;
    int c = 5;
    int d = 7;
    if ( (a > b) ) // condition, boolean value
    {
        // inside if when true found
        System.out.println(" inside if ");
    }
    System.out.println("after if");
    //
    if(a > b)
    System.out.println("11111, after if without curly brackets");
    else
    System.out.println("22222");


    if (a == b) 
    {
        System.out.println(" a == b");
    }
    /*
        int a = 10;
        int b = 15;
        int c = 25;
     */
    // nested if else
    a = 10;
    b = 8;
    c = 5;
    if (a > b) 
    {
        if (a > c) 
        {
            System.out.println("a is greater");    
        }
        else
        {
            System.out.println("c is greater");    
        }
    }
    else
    {
        if(b > c)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("c is greater");
        }
    }
    //
    if (a > b && a >c) 
    {
        System.out.println("a is greater");    
    }
    else
    {
        if (b > c) 
        {
            System.out.println(" b is greater");    
        }
        else
        {
            System.out.println(" c is greater");    
        }
    }

    // if(), else if()
    if(a > b && a > c) // first
    {
        System.out.println(" a is greater");
    }
    else if (b > c)  // second
    {
        System.out.println(" b is greater");
    }
    else  // when above all if and else if are false
    {
      System.out.println(" c is greater");   
    }
    System.out.println("-----------");
    System.out.println(" now checking a,b,c and d, who is bigger");
    // a, b, c, d
    a = 100;
    b = 118;
    c = 125;
    d = 211;
    // using if and else, nested if else
    if (a > b && a > c && a > d) 
    {
        System.out.println("a i greater");
    }
    else 
    {
        if (b > c && b > d) 
        {
            System.out.println(" b is greater");    
        }
        else 
        {
            if (c > d) 
            {
                System.out.println("c i greater");    
            }
            else
            {
                System.out.println("d i greater");    
            }
        }
    }
    System.out.println("checking with else if, a, b, c and d");
    // now checking with else if
    if (a > b && a > c && a > d) 
    {
        System.out.println("a i greater");
    }
    else if(b > c && b > d)
    {
        System.out.println(" b is greater"); 
    }
    else if (c > d) 
    {
        System.out.println("c i greater");
    }
    else 
    {
        System.out.println("d i greater");
    }

    switchExample();

  }   

  public static void switchExample()
  {

    /* 
        1 : sunday
        2 : monday
        3 : tuesday
        4 : wednesday
        5 : thursday
        6 : friday
        7 : saturday

            invalid day
    */
    int day = 8;
    String dayString = "";
    /*
    if (day == 1) 
    {
        dayString = "monday";
    }
    else if (day == 2) 
    {
        dayString = "tuesday";
    }
    */
    switch(day)  // expression   ( int, long, char and String, byte, short)
    {
        case 1:
            dayString = "monday";
            break;
        case 2:
            System.out.println(" day string at case 2 "+dayString);
            dayString = "tuesday";
            break;
        case 3:
        System.out.println(" day string at case 3 "+dayString);
            dayString = "wednesday";
            break;
        case 4:
            dayString = "thursday";
            break;
        case 5:
            dayString = "friday";
            break;
        case 6:
            dayString = "saturday";
            break;
        case 7:
            dayString = "sunday";
            break;
        default:
            dayString = "invalid day";
            break;   
    }
    System.out.println("dayString: "+dayString);

    // NEW SWITCH
    // rules switch / lambda
    switch(day)  // expression   ( int, long, char and String, byte, short)
    {
        
        case 1 -> dayString = "monday";
        case 2 -> {
            System.out.println(" day string at case 2 "+dayString);
            dayString = "tuesday";
          }
        case 3 -> {
            System.out.println(" day string at case 3 "+dayString);
            dayString = "wednesday";
          }
        case 4 -> dayString = "thursday";
        case 5 -> dayString = "friday";
        case 6 -> dayString = "saturday";
        case 7 -> dayString = "sunday";
        default -> dayString = "invalid day";   
    }
    System.out.println("dayString: "+dayString);
  }

}
