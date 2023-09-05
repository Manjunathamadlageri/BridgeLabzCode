package com.empwage;

public class AddwithReturntype
{
    public static void main(String[] args) {
        int z=addition(10,20);
        System.out.println(z);
    }

    private static int addition(int a, int b) {
        int c=a+b;
//        System.out.println(c);
        return c;
     }

}
