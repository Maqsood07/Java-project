package basics;
import java.util.Scanner;
public class printoddnumbers {
    public static void main(String[] args) {
        int num1;
        System.out.println("This application takes input from the user and prints all the odd numbers till the given number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num1 = input.nextInt();
        System.out.println("Printing all the odd number from 1 to "+ num1 );
        for(int i =1; i<=num1; i++)
        {
            if(i%2==1){
                System.out.print(i+" ");
                input.close();
            }
        }
    }
}
