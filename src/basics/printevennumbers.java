package basics;
import java.util.Scanner;
public class printevennumbers {
    public static void main(String[] args) {
        int num1;
        System.out.println("This application takes input from the user and prints all the even numbers till the given number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num1 = input.nextInt();
        System.out.println("Printing all the even number from 1 to "+ num1 );
        for (int i =1;i<=num1;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
            input.close();
        }
    }
}
