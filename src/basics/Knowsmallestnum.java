package basics;

import java.util.Scanner;

public class Knowsmallestnum {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("This application compares two numbers and shows the smallest number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        num1 = input.nextInt();
        System.out.print("Enter the Second Number : ");
        num2 = input.nextInt();
        input.close();
        if(num1<num2)
        {
            System.out.println("The smallest number is : " + num1);
        }
        else
            System.out.println("The smallest number is : " + num2);
    }

}
