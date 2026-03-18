import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the columns in matrix");
        int n = sc.nextInt();      
        System.out.println("ENTER THE ROWS IN MATRIX");
        int m = sc.nextInt();   
        int[][]arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }}
        int count =0;
         for (int i = 0; i < m; i++) {
             int minColIndex = 0;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < arr[i][minColIndex]) {
                    minColIndex = j;                
            }
             int k;
            for (k = 0; k < m; k++) {
                
                if (arr[k][minColIndex] > arr[i][minColIndex]) {
                    break;
               }} if (k == m) {
                System.out.println(arr[i][minColIndex]);
                count++;    
            }}

       // if (count == 0) {
       //     System.out.println("Not  found");
      //  }

        sc.close();
    }
}

            }
    