import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();

        // Sort the character array
        Arrays.sort(arr);

        String result = new String(arr);
        System.out.println(result);
    }
}
