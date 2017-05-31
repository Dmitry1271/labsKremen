package by.bsu.mycompany.thread;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String string = "12 54 df 78sfe 45 23";
        int res=0;
        Scanner con = new Scanner(string);
        boolean continueInput = true;
        do {
            try{
               /* System.out.print("Enter an integer: ");
                */
                int number = con.nextInt();

                System.out.println(
                        "The number entered is " + number);
                res=number;

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                con.nextLine();
            }
        }
        while (continueInput);
        System.out.println(res);
    }
}
