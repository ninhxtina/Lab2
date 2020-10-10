/** Christina Ninh
 * CSSKL143
 */
public class IntList {
    private int numElements = 0;
    private char[] data = new char[100];

    public void add(char letter) {
        data[numElements++] = letter;
    }

    public String toString() {
        String retVal = "";
        for(int i =0; i < numElements; i++) {
            retVal += data[i];
        }
        return retVal;
    }

    //main goes here from the lab
}
