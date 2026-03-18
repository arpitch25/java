//wap to calculate sum of digits of a number
//wap to operate the following function 
// void (int)takes celcius as parameter and converts it into kelvin
//void fahernhiet (int ) takes celcius as input and converts it into faherenhiet 
//create a main for object declaration and calling of the fuinc

import java.util.Scanner;

public class temperature {

    Scanner sc = new Scanner(System.in);

    void celsius(double c) {
        double k = c + 273.15;
        System.out.println("Temperature in Kelvin: " + k);
    }

    void Fahrenheit(double c) {
        double f = (c * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float t = sc.nextInt();

        temperature obj = new temperature();
        obj.celsius(t);
        obj.Fahrenheit(t);
    }
}
