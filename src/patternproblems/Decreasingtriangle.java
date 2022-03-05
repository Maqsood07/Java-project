package patternproblems;
import java.util.Scanner;
public class Decreasingtriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Please enter the input: ");
        int n = s.nextInt();
        for(int i=1;i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
