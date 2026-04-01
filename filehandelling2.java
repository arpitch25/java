import java.io.*;
public class filehandelling2 {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("name.txt");

            int ch; 

            while((ch=fr.read()) !=-1){
                System.out.println((char)ch);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("error"+ e.getMessage());
        }
        }
    }



