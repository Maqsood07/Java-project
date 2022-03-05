package basics;
import java.util.Scanner;
public class Patternfour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num =s.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int k=i;k<num;k++) {
                System.out.print("  ");
            }
            for(int j=0;j<=2*i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }

/*
               *
             * * *
           * * * * *
         * * * * * * *
       * * * * * * * * *

 */
