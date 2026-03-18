/*write a program to operate the following functions 
        1: void circle
        takes input of radius and calculate area
        2: void square take input of side and calculate area
        3: void rectagle takes input of its length and breadth and calculate area
 */
import java.util.Scanner;

public class area2 {
    Scanner sc=new Scanner(System.in);
    void circle(){
        System.out.println("Enter the radius");
        int r = sc.nextInt();
        double a= 3.14*r*r;
        System.out.println("area is "+a);
    }
     void square(){
        System.out.println("Enter the side");
        int s = sc.nextInt();
        int a= s*s;
         System.out.println("area is "+a);
    }
    void rectangle(){
        System.out.println("Enter the 1st side");
        int a = sc.nextInt();
          System.out.println("Enter the 2nd side");
        int b= sc.nextInt();
        a=a*b;
         System.out.println("area is "+a);

    }
        

public static void main(String[]args){

area2 obj=new area2();
obj.circle();
obj.square();
obj.rectangle();

        
}}
