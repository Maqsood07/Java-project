package arrays;
import java.util.Scanner;
public class Arrayprogram1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        boolean flag = false; int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Found at: " + index);
        } else {
            System.out.println("Didnt find! " + index);
        }

    }
}
