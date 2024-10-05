package org.example.oops.abstraction.interface_example;

public class TestClass implements InterfaceSecond
{

    @Override
    public void handleNormalAbstractFirst() {

    }

    @Override
    public void handleDefaultFirst() {
        InterfaceSecond.super.handleDefaultFirst();
    }

    @Override
    public void handleNormalAbstractSecond() {

    }

    @Override
    public void handleDefaultSecond() {
        InterfaceSecond.super.handleDefaultSecond();
    }
}
