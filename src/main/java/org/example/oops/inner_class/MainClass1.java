package org.example.oops.inner_class;

public class MainClass1
{
    public static void main(String[] args)
    {
        /*InnerClassParentExample1 parentExample1 = new InnerClassParentExample1(); // super class
        InnerClassParentExample1.InnerClass1 innerClass1 = parentExample1.new InnerClass1(); // sub class*/

        //InnerClassParentExample1.InnerClass1 innerClass2 = new InnerClassParentExample1().new InnerClass1();

        //InnerClassParentExample1.StaticInnerClass1 staticInnerClass1 = new InnerClassParentExample1.StaticInnerClass1();

        InnerClassParentExample1 innerClassParentExample1 = new InnerClassParentExample1();
        Object object = innerClassParentExample1.outerMethodObject();

        /*
        if (object instanceof DisplayableInterface)
        {
            DisplayableInterface displayableObj = (DisplayableInterface) object;
            displayableObj.display();  // Calling the display method
        }
        else
        {
            System.out.println("Object cannot be cast to Displayable");
        }
        */
        DisplayableClass displayableClass = (DisplayableClass) object;
        displayableClass.display();


    }
}
