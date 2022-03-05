package basics;

import java.util.Scanner;

public class Patternseven {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Please enter a number:");
        int size=s.nextInt();
        for(int i=1;i<=size;i++) {
            int j;
            for (j = 1; j <= size; j++) {
                System.out.print("");
            }
            for (j = 1; j <= i; j++) {
                System.out.println("" + j);
            }
            for(j=i-1;j>=1;j--)
            {
                System.out.println(""+ j);
            }

        }
    }
}
