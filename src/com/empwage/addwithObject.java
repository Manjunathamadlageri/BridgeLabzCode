package com.empwage;

public class addwithObject
{
    public static void main(String[] args) {
        addwithObject addwithobject=new addwithObject();
        int z=addwithobject.additionMethod(10,20);
        System.out.println(z);
    }

    private int additionMethod(int a, int b) {
        int c=a+b;
        return c;
     }


}
