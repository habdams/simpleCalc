import java.util.Scanner;

public class SwitchString {
    static  String [] months ={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a month number");
//        String input = sc.nextLine();
//        int d = Integer.parseInt(input);
//
//        switch (d) {
//            case 1:
//                System.out.println("January");
//            break;
//            case 2:
//                System.out.println("February");
//                break;
//            default:
//                System.out.println("You have choosen another month");
//                break;
//
//        }



//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//        }
//        for (int i = months.length-1; i >=0; i--) {
//            System.out.println(months[i]);
//        }
//
//
//        int counter = 0;
//        while(counter < months.length){
//            System.out.println(months[counter]);
//            counter ++;
//
//        }
            floppy("Months of the year");
    }

    static void floppy(String label){
        System.out.println(label);
        for(int j=0 ;j < label.length() ;j++){
            System.out.print('*');
        }
        System.out.println("");
        for (int i = 0; i < months.length; i++) {
            System.out.println("");
            System.out.println(months[i]); 
            for(int k=0; k< months[k].length();k++){
                System.out.print("*");

            }

        }
    }
}
