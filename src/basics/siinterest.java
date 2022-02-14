package basics;

import java.util.Scanner;

public class Siinterest {
    public static void main(String[] args) {
        int p, r, t, si;
        System.out.println("This application calculates the Simple interest");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal : ");
        p = input.nextInt();
        System.out.print("Enter the rate of interest : ");
        r = input.nextInt();
        System.out.print("Enter the time period : ");
        t = input.nextInt();
        input.close();
        si = (p * r * t) / 100;
        System.out.print("The Simple interest is : "+si);
    }
}
