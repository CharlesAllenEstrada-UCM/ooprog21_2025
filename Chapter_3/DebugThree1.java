// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
 
public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble(); // The input.nextInt() function was replaced by input.nextDouble() to accommodate decimal numbers.s
 
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble(); // 'inputnextInt()' was corrected to 'input.nextDouble()'. 
        calcTip(check1); 
        calcTip(check2);
    }
 
    // The 'double bill' argument was added to receive input values
    public static void calcTip(double bill) {
        final double RATE = 0.15; // 'Doubel' was corrected to 'double'.
        double tip;
        tip = bill * RATE; // The calculation "bill / RATE" is incorrect; it should read "bill * RATE."
        System.out.println("The tip should be at least $" + tip);
    }
}