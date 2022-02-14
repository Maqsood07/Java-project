package basics;
import java.util.Scanner;
public class Program10 {
    public static void main(String[] args) {
        char ch;
        int num1,num2,num3,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
       ch = input.next().charAt(0);
        System.out.print("3 test marks:");
        num1 =input.nextInt(); num2 = input.nextInt();num3 =input.nextInt();
        total = (num1+num2+num3)/3;
        System.out.println(ch +" "+ total);
    }
}
