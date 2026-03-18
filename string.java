import java.util.Scanner;
public class string {
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string :");
            String s1= sc.next();
            s1=s1.toUpperCase();
            int a=0,e=0,I=0,o=0,u=0;
            for (int i=0;i<s1.length();i++){
                char check=s1.charAt(i);

               switch (check) {
                case 'A': a++;
                break;
                case 'E': e++;
                break;
                case 'I': I++; 
                break;
                case 'O': o++; 
                break;
                case 'U': u++; 
                break;
            }

            }
          System.out.println("the string is : "+s1);
          System.out.println("a "+a);
          System.out.println("e "+e);
          System.out.println("i "+I);
          System.out.println("o "+o);
          System.out.println("u "+u);
        }
    
}
