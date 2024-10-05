package org.example.oops.abstraction.interface_example;

public interface InterfaceSecond extends InterfaceFirst
{

    void handleNormalAbstractSecond();


    default void handleDefaultSecond()
    {
        System.out.println(" inside handleDefaultSecond ");
        handleDefaultFirst(); // default parent
        handleNormalAbstractFirst(); // normal parent
        InterfaceFirst.handleStaticFirst(); // static
    }

    static void handleStaticSecond()
    {
        System.out.println(" inside handleStaticSecond ");
    }

    // actor

    private void handlePrivateSecond()
    {
        //
    }
    //


}
