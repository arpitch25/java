import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }}

public class ageexception {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new AgeException("not eligible");
            } else {
                System.out.println("eligible to vote");
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
           }
}