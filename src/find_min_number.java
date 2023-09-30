import java.util.Scanner;

public class find_min_number {
    public static void main(String[] args) {
        short a,b,c,min;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers:");
        System.out.print("a = ");
        a=sc.nextShort();

        System.out.print("b = ");
        b=sc.nextShort();

        System.out.print("c = ");
        c=sc.nextShort();

        min = (a<b && a<c) ? a : (b<a && b<c ) ? b : c;
        System.out.println("Min number is : " + min);

    }
}
