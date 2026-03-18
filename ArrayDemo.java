import java.util.*;

class ArrayDemo {

    void arrayFunc(int arr[], int target) {
        System.out.println("Pairs of elements whose sum is " + target + " are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    void arrayFunc(int A[], int p, int B[], int q) {
        int[] temp = new int[p + q];
        int i = 0, j = 0, k = 0;

        while (i < p && j < q) {
            if (A[i] < B[j]) {
                temp[k++] = A[i++];
            } else {
                temp[k++] = B[j++];
            }
        }

        while (i < p) {
            temp[k++] = A[i++];
        }

        while (j < q) {
            temp[k++] = B[j++];
        }

        for (i = 0; i < p; i++) {
            A[i] = temp[i];
        }

        for (j = 0; j < q; j++) {
            B[j] = temp[p + j];
        }

        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayDemo obj = new ArrayDemo();

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        obj.arrayFunc(arr, target);

        System.out.print("\nEnter size of array A: ");
        int p = sc.nextInt();
        int A[] = new int[p];

        System.out.println("Enter sorted elements of A:");
        for (int i = 0; i < p; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter size of array B: ");
        int q = sc.nextInt();
        int B[] = new int[q];

        System.out.println("Enter sorted elements of B:");
        for (int i = 0; i < q; i++) {
            B[i] = sc.nextInt();
        }

        obj.arrayFunc(A, p, B, q);

        sc.close();
    }
}