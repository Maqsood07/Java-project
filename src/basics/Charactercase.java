package basics;
import java.util.Scanner;
public class Charactercase {
    public static void main(String[] args) {
        char s;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        s = input.next().charAt(0);
        if(s>='A'&& s<='Z'){
            System.out.println(1);
        }
        else if(s>='a'&& s<='z'){
            System.out.println(0);
        }
        else
            System.out.println(-1);

    }
}
