import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int swapCount = 0;  // counter for swaps

        // Selection sort
        for(int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap only if needed
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;   // increment swap counter
            }
        }

        // Print sorted array
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print swap count
        System.out.println("\nTotal swaps: " + swapCount);
    }
}