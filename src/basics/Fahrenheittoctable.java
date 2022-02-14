package basics;
import java.util.Scanner;
public class Fahrenheittoctable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the temperature");
        int start = s.nextInt();
        int end = s.nextInt();
        int def =s.nextInt();
        int formula;
        for(;start<=end;start=start+def){
            formula =(start-32)* 5/9;
            System.out.println(start+"\t"+formula);
        }
    }
}
