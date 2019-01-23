import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;
public class Main {
    public static void main(String[] args){

        System.out.println("Hello, Welcome to Dr Calc. :)) ");

        try {
            System.out.println("Please input the first value: ");
            Scanner sc = new Scanner(System.in);
            int firstInput = sc.nextInt();

            System.out.print("Please input the second value: ");
            int secondInput = sc.nextInt();

            int totalSum = firstInput + secondInput;

            System.out.println("The Sum is : " + totalSum);
        } catch (InputMismatchException e) {
            System.out.println("Error! Please, you can only type in integers(Numbers, e.g 1,3,5,7,80 et al.)");
        }


    }
}
