package org.example.overview;

/*
    1. java overview ( jdk, jre, psvm, access modifier, return type, method name, keywords, identifier, )
    2. data types: 
    3. variables: 
    4. methods: access-modifier return-type name (argument)

    BODMAS: breacket, off (expo), Divide, multiply, addition, subtraction
    operator: 
    1. arthematic : +, -, *, /, %
    2. assignment   : =, +=, -=, *=, /=, 
    3. unary ( increment / decrement): ++, -- ( prefix & postfix)
    4. relational: <, >, <=, >=, == !=
    5. logical: &&, ||, NOT !,  Discrete Mathematics
    6. bitwise: &, |, XOR, Discrete Mathematics
    7. shift operator: <<, >>, >>>
    8. ternary: ? :
 */

/*
 Naming Convention
 1. keywords : small letter
 2. class name: First Character is  Capital of every word
 3. variable, method, parameter: camelCase, ex: userName, showData, 
    description: first Word is small, then every first character of word is capital
 */

  public  class JavaVariableWithMultiClass 
{

    ////static String currentTopic = "java varaiables";
    static String instituteName = "Grras";
    String address = "gopalpura";
    public static void main(String[] args) 
    {
        System.out.println("at JavaVariableWithMultiClass");
        System.out.println(instituteName);
        JavaVariableWithMultiClass object1 = new JavaVariableWithMultiClass();
        object1.showAvailableJavaBatch();
        showAvailableDsaBatch();
        System.out.println(object1.address);
        System.out.println(" getting object from method start");
        JavaVariableChildClass objectWithNew = new JavaVariableChildClass();
        System.out.println("objectWithNew: "+objectWithNew);
        JavaVariableChildClass objectFromMethod = JavaVariableChildClass.getChildClassObject();
        System.out.println("objectFromMethod: "+objectFromMethod);
        objectFromMethod.subtractOfTwoNumber(4, 7);
        System.out.println(" getting object from method end");
        /*
        //here we create below class object to read property of below class
        JavaVariableChildClass objectChildClass = new JavaVariableChildClass();
        System.out.println(objectChildClass.batchTime);
        System.out.println(JavaVariableChildClass.currentTopic);
        int a = 5;
        int b = 3;
        int sum = objectChildClass.sumOfTwoNumber(a, 4);
        System.out.println(" sum is: "+sum);
        System.out.println(objectChildClass.sumOfTwoNumber(a, 8));
        JavaVariableChildClass.multiplyOfTwoNumber(6, b);
        double subtract = objectChildClass.subtractOfTwoNumber(a, 4);
        String fullName = objectChildClass.concateFirstAndLastName("kartik", "manvi");
        System.out.println("fullName: "+fullName);
        boolean isValid = objectChildClass.isMobileNoValid("9799605400");
        System.out.println("isValid: "+isValid);
        System.out.println(Arrays.toString(objectChildClass.getStudents()));
        String names =  Arrays.toString(objectChildClass.getStudents());
        System.out.println(names);
        */
    }

    public void showAvailableJavaBatch()
    {
        System.out.println(instituteName);
    }

    public void showAvailableJavaBatch(int a)
    {
        System.out.println(instituteName);
    }
    
    public static void main() 
    {

    }

    public static  void showAvailableDsaBatch()
    {
        System.out.println(instituteName);
        String[] names = {"vijay","ajay"};
    }

    public static byte module(byte a, byte b)
    {
        byte mod = (byte)(a - b);
        return mod;
    }


}


class JavaVariableChildClass
{

    String batchTime = "6:15 PM";
    static String currentTopic = "java varaiables";
    int a = 5;
    int b = 10;
    // jvm will not call this main name method
    public static void main(String[] args) 
    {
        System.out.println("at JavaVariableChildClass");
    }    

    public int sumOfTwoNumber(int a, int b)
    {
        double sum = a + b;
        //System.out.println(" sum: "+sum);
        return (int)sum;
    }

    public double subtractOfTwoNumber(int a, int b)
    {
        double subtract = a - b;
        System.out.println(" subtract: "+subtract);
        return subtract;
    }

    public static void multiplyOfTwoNumber(int a, int b)
    {
        int multiply = a * b;
        System.out.println(" multiply: "+multiply);
    }

    public String concateFirstAndLastName(String firstName, String lastName)
    {
        String fullName = firstName + " "+ lastName;
        return fullName;
    }

    // +91
    public boolean isMobileNoValid(String mobileNo)
    {
        boolean isValid = false;
        if (mobileNo.length() == 10) 
        {
            isValid = true;    
        }
        return  isValid;
    }

    // a, e, i, o, u : vowel an apple
    // consonant
    // a, b

    public String[] getStudents()
    {
        String[] names = {"vijay","govind","mitasha"};
        return  names;
    }

    public static  JavaVariableChildClass getChildClassObject()
    {
        JavaVariableChildClass javaVariableChildClass = new JavaVariableChildClass();
        return  javaVariableChildClass;
    }



}
