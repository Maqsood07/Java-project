package basics;
import java.util.Scanner;
public class Patternsix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num =s.nextInt();
        for(int i=num-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*" + " ");
            }

            System.out.println(" ");
        }
    }
    }

