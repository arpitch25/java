import java.util.*;

abstract class Temperature {
    double temp;

    void setTempData(double t) {
        temp = t;
    }

    abstract void changeTemp();
}

class Fahrenheit extends Temperature {
    double ctemp;

    void changeTemp() {
        ctemp = (5.0 / 9.0) * (temp - 32);
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}

class Celsius extends Temperature {
    double ftemp;

    void changeTemp() {
        ftemp = (9.0 / 5.0) * temp + 32;
        System.out.println("Temperature in Fahrenheit: " + ftemp);
    }
}

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();

        Temperature t1 = new Fahrenheit();
        t1.setTempData(f);
        t1.changeTemp();

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        Temperature t2 = new Celsius();
        t2.setTempData(c);
        t2.changeTemp();

        sc.close();
    }
}