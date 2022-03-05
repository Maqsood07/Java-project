package basics;
import java.util.Scanner;
public class Patternfive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num =s.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int k=0;k<i;k++)
                System.out.print("  ");
            for(int j=i;j<num;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
