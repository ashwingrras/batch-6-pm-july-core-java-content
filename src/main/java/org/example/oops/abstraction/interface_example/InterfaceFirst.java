package org.example.oops.abstraction.interface_example;

public interface InterfaceFirst
{

    // variable: implicit ( static, final and public )
    // normal method: implicit ( abstract, public )
    // default method : java 8
    // static method : java 8
    // private method: java 9

    void handleNormalAbstractFirst();


    default void handleDefaultFirst()
    {
        System.out.println(" inside handleDefaultFirst ");
    }

    static void handleStaticFirst()
    {
        System.out.println(" inside handleStaticFirst ");
    }

    // actor

    private void handlePrivateFirst()
    {
        //
    }
    //
}
