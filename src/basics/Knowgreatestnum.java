package basics;

import java.util.Scanner;

public class Knowgreatestnum {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("This application compares two numbers and shows the greatest number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        num1 = input.nextInt();
        System.out.print("Enter the Second Number : ");
        num2 = input.nextInt();
        input.close();
        if(num1>num2)
        {
            System.out.println("The greatest number is : " + num1);
        }
        else
            System.out.println("The greatest number is : " + num2);
    }
}
