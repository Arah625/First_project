
import java.util.Scanner;
public class Nowa_lekcja {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        String com = "Unknown action";
        Float fnum, snum;
        Character operation;
        System.out.println("Enter first number: ");
        fnum = calculator.nextFloat();
        System.out.println("Enter second number: ");
        snum = calculator.nextFloat();

        System.out.println("Addition - press +");
        System.out.println("Subtraction - press -");
        System.out.println("Multiplication - press *");
        System.out.println("Division - press /");

        operation = calculator.next().charAt(0);

        switch(operation){
            case '+': {
                System.out.println(fnum + snum);
                break;
            }
            case '-': {
                System.out.println(fnum - snum);
                break;
            }
            case '*': {
                System.out.println(fnum * snum);
                break;
            }
            case '/': {
                if (snum != 0)
                    System.out.println(fnum / snum);
                else
                    System.out.println("Dividing by zero is not possible!");
                break;
            }
            default:
                System.out.println(com);


        }
    }
}