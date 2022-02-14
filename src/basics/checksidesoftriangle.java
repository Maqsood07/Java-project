package basics;

import java.util.Scanner;

public class Checksidesoftriangle {
    public static void main(String[] args) {
        int side1, side2, side3;
        System.out.println("This application compares three sides and shows if it is triangle or not");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side : ");
        side1 = input.nextInt();
        System.out.print("Enter the second side : ");
        side2 = input.nextInt();
        System.out.print("Enter the third side : ");
        side3 = input.nextInt();
        input.close();
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            System.out.println("It is a triangle");
        } else
            System.out.println("It is not a triangle");
    }
}
