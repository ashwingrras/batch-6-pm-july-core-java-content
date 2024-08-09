package org.example.overview;// public: access modifire
// public, protected, private and default

// static: keywword, static variable, static methods

// void: return type
   public class FirstProgram
{

    public static void main(String[] args) 
    {
        System.out.println("This is my First Program main method");
        showData();
        FirstProgram firstProgram1 = new FirstProgram();
        System.out.println(firstProgram1);
        firstProgram1.main();
        FirstProgram firstProgram2 = new FirstProgram();
        System.out.println(firstProgram2);
    }
    public void main() 
    {
        System.out.println(" at FirstProgram main method without argument");    
    }

    //
    public static void showData() 
    {
        System.out.println(" at FirstProgram showData method");    
    }

    public static String showName() 
    {
        System.out.println(" at FirstProgram showData method");    
        return "name";
    }
    
}


 class ChildClass
{

    int a = 10;
    String name = "ashwin";

    public void main() 
    {
        System.out.println(" at ChilClass main method");    
    }


}
