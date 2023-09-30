import java.util.Scanner;

public class mini_calculator {
    public static void main(String[] args) {
        int a,b;
        char operation;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: a =  ");
        a=sc.nextInt();

        System.out.print("Enter the second number: b = ");
        b=sc.nextInt();

        System.out.print("Enter the operation: operation = " );
        operation = sc.next().charAt(0);

        switch (operation){
            case '+':
                System.out.println("result = " + (a+b));
                break;

            case '-':
                System.out.println("result = " + (a-b));
                break;

            case '*':
                System.out.println("result = " + (a*b));
                break;

            case '/':
                if(b==0){
                    System.out.println("there is no division to zero.");
                }
                else {
                    System.out.println("result = " + (a/b));
                }
                break;

            default:
                System.out.println("Your choice is incorrect");


        }


    }
}
