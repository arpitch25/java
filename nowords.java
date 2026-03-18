import java.util.Scanner;
public class nowords {
      public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the string :");
            String s1= sc.nextLine(); 
            String[]s2=s1.split("\\s+");
            int n1=s1.length();
            int n2=s2.length;
            System.out.println("no of words  " +n2);

      }
}
