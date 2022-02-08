package basics;
import java.util.Scanner;
public class program10 {
    public static void main(String[] args) {
        String name;
        int num1,num2,num3,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        name = input.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("3 test marks:");
        num1 =input.nextInt(); num2 = input.nextInt();num3 =input.nextInt();
        total = (num1+num2+num3)/3;
        System.out.println(name + total);
    }
}
