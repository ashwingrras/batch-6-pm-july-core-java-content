package org.example.string_handling;

import java.util.Arrays;

/*
       12
            puma mens tshirt bla...
        dabur honey to
        ooth paste wi
        th crystal clear
        1. valueOf
        2. regionMatch
        3. strip
        4. split
        5. substring
        6. replace
        7. toCharArray
        8. getChar()

 */
public class StringExample2
{
    public static void main(String[] args)
    {

        String dob1 = "14-10-1992";
        String dob2 = "5-7-2008";
        String[] dobSplit = dob1.split("-");
        System.out.println("dobSplit array length "+dobSplit.length);
        System.out.println(Arrays.toString(dobSplit));
        String city1 = "JAIPUR";
        String city2 = "Jaipur";
        String city3 = "jaipur";
        System.out.println(city1.equalsIgnoreCase(city2));
        System.out.println(city1.equalsIgnoreCase(city3));
        System.out.println(city2.equalsIgnoreCase(city3));
        String mobileNo = "   9799605400            ";
        mobileNo = mobileNo.strip();
        System.out.println(mobileNo.length());
        String state  = "rajasthan";
        state = state.toUpperCase();
        System.out.println("state: "+state);
        String str = "\u2005\u2005manoj\u2005\u2005";
        System.out.println("str length: "+str.length());
        System.out.println(str.trim().length());
        System.out.println(str.strip().length());
        String product = "black tshirt puma xl size";
        System.out.println(product.contains("t  puma "));


        //
    }
}
