import java.util.Scanner;

abstract class shape{
    abstract void rectanglearea(double l, double b);
    abstract void squarearea(double s);
    abstract void circlearea(double r);


}
class area extends shape{
    void rectanglearea(double l,double b){
        double area=l*b;
        System.out.println("area of rectangle is "+ area);


    }

    void squarearea(double s){
        double area=s*s;
         System.out.println("area of square is "+ area);

    }
    void circlearea(double r){
        double area=3.14*r*r;
         System.out.println("area of square  is "+ area);
    }
}





public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shape obj=new area();
        obj.rectanglearea(5, 4);
        obj.squarearea(4);
        obj.circlearea(3);


    }
    
}
