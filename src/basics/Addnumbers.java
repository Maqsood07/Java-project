package basics;

import java.util.Scanner;

public class Addnumbers {
    public static void main(String[] args) {
        int num1,num2,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        num1 = input.nextInt();
        System.out.print("Enter the Second Number : ");
        num2 = input.nextInt();
        input.close();
        result = num1+num2;
        System.out.println("The sum of two numbers is : " + result);
    }


}
