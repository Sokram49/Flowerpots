/* Markos Trujillo
 * 2/19/2024
 */

import java.util.Scanner;
public class Flowerpots {

    public static void main(String[] args) {

        //Variables
        Scanner input = new Scanner(System.in);
        int potNum, bigBox, smallBox;
        Calculate math = new Calculate();

        //Calculate
        System.out.print("Enter number of pots: ");
        potNum = input.nextInt();
        math.setNumPots(potNum);

        bigBox = math.getNumBig();
        smallBox = math.getNumSmall();
        
        //Output
        System.out.println(potNum + " pots would require " + bigBox + " big boxes and " + smallBox + " small boxes.");

    }
    
}
