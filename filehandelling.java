import java.io.*;
public class filehandelling {
    public static void main(String[] args) {
        try{
            FileWriter fw= new FileWriter("output.txt");
            fw.write("hello world \n");
            fw.write("file handelling without buffer");
            fw.close();
        } catch (IOException e){
            System.out.println("error"+ e.getMessage());
        }
    }

}
