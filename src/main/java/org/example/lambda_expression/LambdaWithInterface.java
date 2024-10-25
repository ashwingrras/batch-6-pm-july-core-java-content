package org.example.lambda_expression;
interface AddNumber{                   //HERE INTERFACE CONTAIN ONLY SINGLE METHOD SO IT IS FUNCTIONAL INTERFACE
    int getAdd(int a,int b);
}
public class LambdaWithInterface {
    public static void main(String[] args) {
        AddNumber add = (a,b)->  a+b;  //LAMBDA EXPRESSION For adding two numbers
        System.out.println(add.getAdd(2, 20));
    }
}
