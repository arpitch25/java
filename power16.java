import java.util.Scanner;
class calculator{
    long power(int n,int p)throws Exception{
        if (n==0&&p==0)
            throw new Exception("n and p should not be zero");
        if (n<0||p<0) 
            throw new Exception("n or p should not be negative");
        return (long) Math.pow(n, p);
    }}

public class power16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        calculator obj=new calculator();
        

        sc.close();
        
    }
    
    
}
