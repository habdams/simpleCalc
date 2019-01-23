import java.util.Scanner;

public class MethodOverload {

    public static void main(String[] args){

        String s1 = getValue("Input 1: ");
        String s2 = getValue("Input 2: ");
        String s3 = getValue("Input 3: ");


        double result = addValue(s1,s2);
        double result2 = addValue(s1,s2, s3);
        double result3 = addValue(s1,s2,s3,s1,s2,s3);




        System.out.println("The result1  is: " + result);
        System.out.println("The result2  is: " + result2);
        System.out.println("The result3  is: " + result3);


    }

    static String getValue(String prompt){
        System.out.println(prompt);

        Scanner sc = new Scanner(System.in);


        return sc.nextLine();

    }

    static double addValue(String s1, String s2){

        double d1 = Double.parseDouble(s1);

        double d2 = Double.parseDouble(s2);

        double result = d1 + d2;

        return result;

    }

    static double addValue(String s1, String s2, String s3){

        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);

        double result = d1 + d2 + d2 ;

        return result;

    }

    static double addValue(String ... value){
        double result = 0;
        for(String values:value){

            double d = Double.parseDouble(values);
            result += d;

        }

        return result;
    }
}
