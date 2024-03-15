/* Markos Trujillo
 * 2/19/2024
 */

public class Calculate {

    //Variables
    private int numPots;
    private int numBig;
    private int numSmall;

    //Default Constructor
    public Calculate() {
        numPots = 0;
        numBig = 0;
        numSmall = 0;
    }

    //Constructor
    public Calculate(int potNum, int bigBox, int smallBox) {
        numPots = potNum;
        numBig = bigBox;
        numSmall = smallBox;
    }

    //Method that sets number of pots
    public void setNumPots(int potNum) {
        numPots = potNum;
    }

    //Method that gets number of big boxes
    public int getNumBig() {
        numBig = numPots / 4;
        return numBig;
    }

    //Method that gets number of small boxes
    public int getNumSmall() {
        numSmall = numPots % 4;
        return numSmall;
    }

}
