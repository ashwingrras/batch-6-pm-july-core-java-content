package org.example.oops.aggregation;

public class MainClass
{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        student1.setName("vakul");

        Address address1 = new Address();
        address1.setCity("jaipur");
        address1.setPincode("302019");

        student1.setAddress(address1);
    }
}
