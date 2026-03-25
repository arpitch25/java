import java.util.Scanner;
class invalidnameexception extends Exception{
    public invalidnameexception(String message){
        super(message);
    }
}
public class employee15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter the employee id ");
            int empid=sc.nextInt();
            sc.nextLine();
            System.out.println("enter name");
            String name=sc.nextLine();
            System.out.println("enter department id");
            int depid=sc.nextInt();
            if (name.isEmpty()||!Character.isUpperCase(name.charAt(0)))
                throw new invalidnameexception("first letter not capital");
            if (empid<2001||empid>5001) 
                throw new invalidnameexception("employee id  is not between 2001 and 5001");
            if (depid<1||depid>6)
                throw new invalidnameexception("department id should be bw 1 and 5");
            System.out.println("employee details are  ");
            System.out.println("employee id is  :"+empid);
            System.out.println("employee name is : "+name);
            System.out.println("department id is : "+depid);           
        }
        catch(invalidnameexception e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("invalid input ");

        }

    }

    
}
