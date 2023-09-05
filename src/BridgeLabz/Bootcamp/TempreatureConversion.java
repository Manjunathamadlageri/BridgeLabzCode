package BridgeLabz.Bootcamp;

import java.util.Scanner;

public class TempreatureConversion
{
    public static void main(String[] args) {

        double fahrenheit, celsius;

        Scanner sc=new Scanner(System.in);

        System.out.println("Choose type of cnoversion \n1."+"Fahreheit toClsius\n " +"2.Calsius to Fahrenheit");

        int ch=sc.nextInt();

        switch(ch) {

            case 1:
            System.out.println("Enter the Fahrenheit Conversion");

            fahrenheit=sc.nextDouble();

            celsius =(fahrenheit-32)*5/9;

            System.out.println("Celius Tempreature"+celsius);

            break;

            case 2:

                System.out.println("Enter the Celsuis Conversion");

                celsius = sc.nextDouble();
                fahrenheit = ((9 *celsius)/5)+32;

                System.out.println("Fahrenheit Tempreature"+fahrenheit);
        }
    }
}
