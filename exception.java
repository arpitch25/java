import java.util.Scanner;
class exception{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        System.out.println("enter the divisor ");
        int d=sc.nextInt();
        try{
            int result =num/d;
            System.out.println("result  "+ result);

        }
        catch (ArithmeticException e){
            System.out.println("divisor cannot be zero");
        }
    }
}