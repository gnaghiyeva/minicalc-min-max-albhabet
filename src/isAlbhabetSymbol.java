import java.util.Scanner;

public class isAlbhabetSymbol {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the symbol:");
        c= sc.next().charAt(0);

        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
//            System.out.println(c + " "+ "is an albhapet symbol");

            if(c == Character.toLowerCase(c)){
                System.out.print("output: "+Character.toUpperCase(c));
            }
            else {
                System.out.println("output: "+Character.toLowerCase(c));
            }
        }
        else {
            System.out.println(c + " - "+"The symbol you entered is not alphabet");
        }
    }
}
