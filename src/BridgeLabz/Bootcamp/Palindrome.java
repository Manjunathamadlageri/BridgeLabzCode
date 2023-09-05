package BridgeLabz.Bootcamp;

import java.util.Scanner;

public class Palindrome
{
    public static void print1(int num)
    {
        int res=0;
        int temp=num ;
        while(num>0)
        {
            int rem=num%10;
            res=res*10+rem;
            num=num/10;
        }
        System.out.println(res +" "+ temp);
        if(temp==res)
        {
            System.out.println("palinderom");
        }
        else
        {
            System.out.println("is not palinderom");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n= sc.nextInt();
        print1(n);
    }
}
