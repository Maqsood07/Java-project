package basics;

import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.println("This application compares three numbers and shows the 2nd largest number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        num2 = input.nextInt();
        System.out.print("Enter the third number : ");
        num3 = input.nextInt();
        input.close();
        if (num1 > num2 && num1 < num3 || num1 > num3 && num1 < num2)
            System.out.println("The second largest number is :"+num1);
        else if (num2 > num1 && num2 < num3 || num2 > num3 && num2 < num1)
            System.out.println("The second largest number is :"+num2);
        else
            System.out.println("The second largest number is :"+num3);
     }
}
