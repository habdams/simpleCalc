
import java.util.Scanner;

public class ComplexCalc {

    public static void main(String[] args){


        try {
            String s1= getInput("Please enter a numeric value: ");
            String s2= getInput("Please enter a numeric value: ");

            desiredOperation(s1,s2);
        } catch (NumberFormatException e) {
            System.out.println("Only Numeric values are allowed " + e.getMessage());
        }


    }
    static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    static double desiredOperation(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = 0;
        System.out.println("Choose an Operator: (e.g *,+,-,/,re(remainder))");

        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();

        switch(op){
            case "*":
                result = d1 * d2;
                System.out.println("Answer: " + result);
                break;
            case "+":
                result = d1 + d2;
                System.out.println("Answer: " + result);
                break;
            case "-":
                result = d1 - d2;
                System.out.println("Answer: " + result);
                break;
            case "/":
                result = d1 / d2;
                System.out.println("Answer: " + result);
                break;
            case "re":
                result = d1 % d2;
                System.out.println("Answer: " + result);
                break;
            default:
                System.out.println("You have chosen a rather complicated operator, we will consider it for our next upgrade.");
                break;
        }
    return result;
    }
}
