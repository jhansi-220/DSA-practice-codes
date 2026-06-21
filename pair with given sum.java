import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input target sum
        int target = sc.nextInt();
        
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        
        // Two-pointer approach
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                found = true;
                break; // stop after finding one pair
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        if (!found) {
            System.out.println("No pair found");
        }
        
        sc.close();
    }
}
