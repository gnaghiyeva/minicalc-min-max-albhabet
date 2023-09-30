import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float a,b,c,max;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        System.out.print("a = ");
        a=sc.nextFloat();

        System.out.print("b = ");
        b=sc.nextFloat();

        System.out.print("c = ");
        c=sc.nextFloat();

        if(a>b && a>c){
            max=a;
        }
        else if(b>a && b>c){
            max = b;
        }

        else {
            max = c;
        }

        System.out.println("Max number is: " +max);
    }
}