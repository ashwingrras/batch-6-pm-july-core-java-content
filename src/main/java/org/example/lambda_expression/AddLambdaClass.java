package org.example.lambda_expression;

public class AddLambdaClass {

    public static void  main(String[] args)
    {
        AddLambdaInterface add = ( a, b) ->  a+b;
        System.out.println(add.getAdd(20, 25));

        AddLambdaInterface addLambdaInterface = new AddLambdaInterface() {
            @Override
            public int getAdd(int a, int b)
            {
                System.out.println("inside interface method body");
                return a + b;
            }
        };

        System.out.println(addLambdaInterface.getAdd(2, 20));




    }

}
