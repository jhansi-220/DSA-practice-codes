import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // two pointer approach
        int left=0;  // start pointer
        int right=n-1;  // end pointer
        while(left<right){
            if(arr[left]==0){
                left++;
            }else if(arr[right]==1){
                right--;
            }else{
                int temp=arr[left];  // swap array left and right
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//Time complexity - O(n)
//space complexity - O(1)