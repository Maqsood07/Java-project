package basics;
import java.util.Scanner;
public class Printevennumbers {
    public static void main(String[] args) {
        int num1;
        System.out.println("This application takes input from the user and prints all the even numbers till the given number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num1 = input.nextInt();
        int sum=0;
        System.out.println("Printing all the prime number from 1 to "+ num1 );
        for (int i =2;i<=num1;i=i+2)
        {
            if(i%2==0)
                System.out.println(""+i);
            input.close();
        }
    }
}
