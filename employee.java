import java.util.Scanner;
 class employee {
    double basicpay;
    double hra;
    double da;
    double gross;

    void inputsalary(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the basic pay  ");
        basicpay=sc.nextDouble();
    }

    void calculatesalary(){
        hra=0.10*basicpay;
        da=0.15*basicpay;
        gross=basicpay+hra+da;
    }  
}

class manager extends employee{

void calculatesalary(){

    super.calculatesalary();
    System.out.println("total salary is "+ gross);
}
public static void main(String args[]){
    manager m=new manager();
    m.inputsalary();
    m.calculatesalary();
}


}
