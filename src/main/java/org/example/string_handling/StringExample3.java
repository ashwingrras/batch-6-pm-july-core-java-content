package org.example.string_handling;

public class StringExample3
{
    public static void main(String[] args)
    {
        String name1 = "vakul sharma";
        name1 = name1.concat(" sharma");
        String name2 = "vakul sharma";
        System.out.println(name1 == name2);

        String name3 = new String("vakul sharma");
        name3 = "vakul sharma";
        System.out.println(name2 == name3);
        int id = 1001;
        String strId = String.valueOf(id);
        // Region Matches
        String str1 = "Hi World";
        String str2 = "world";
        boolean result = str1.regionMatches(false,3, str2, 1, str2.length());
        System.out.println("result: "+result);

        // Sub String
        String str = "HelloAWorld";
        String sub1 = str.substring(6);
        String sub2 = str.substring(0, 5);
        System.out.println("sub1 : "+sub1);
        System.out.println("sub2 : "+sub2);
        System.out.println("sub2 : "+sub2.length());
        String sub3 = str.substring(6, 11);
        System.out.println("sub3 : "+sub3);
        String strTest = "i love my india";
        // love
        // india
        System.out.println(strTest.substring(2,6));
        System.out.println(strTest.substring(10,15));

        //
        // Question 1: bill max character length 14
        // dabur honey tooth paste with crystal clear
        // dabur honey to
        // oth paste with
        // crystal clear
        ///////

        //Question 2: max character length 14 and max line 2, and if character exceed to more than
        // second line then show 3 dot like this: ...
        //// dabur honey tooth paste with crystal clear
        // dabur honey to
        // oth paste w...
        //// dabur honey tooth paste with
        // dabur honey to
        // oth paste with

        // Question 3: find character count
        // input : aashish
        // output: [2, 2, 2, 1]   ( with one Dimension array )
        // { {"a", "2"}, {"s", "2"}, {"h", "2"}, {"i", "1"} }  // ( with two dimension array )

        // aashish
        // ashi

    }
}
