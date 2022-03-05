package basics;
import java.util.Scanner;
public class Patternone {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int nRows = s.nextInt();
        int currRow = 1;
        while (currRow <= nRows) {
            int currCol = 1;
            while (currCol <= currRow) {
                System.out.print("*");
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}
