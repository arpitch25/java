import java.util.Scanner;

public class matrixprime {

    int[][] matrix;
    int m, n;

    matrixprime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  rows: ");
        m = sc.nextInt();

        System.out.print("Enter  columns: ");
        n= sc.nextInt();
        matrix = new int[m][n];

        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }

    }}
     void calculate(){
      System.out.println("Prime no. are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int no = matrix[i][j];
                int count = 0;
                if (no > 1) {
                    for (int k = 1; k <= no/2; k++) {
                        if (no % k == 0) {
                            count++;
                        }}
                }
                if (count == 2) { 
                    System.out.print( no + " ");
                }}
        }
    }   
        public static void main(String[] args) {
        matrixprime obj = new matrixprime(); 
        obj.calculate();                     
        //sc.close();
        }

    }


