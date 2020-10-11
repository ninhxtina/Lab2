/** Christina Ninh
 * CSSKL143
 */
import java.util.Arrays;

public class Picture {

    /** The items. */
    private Object[] myShapes;

    /** The size. */
    private int numElements;

    /** The Constant CAPACITY. */
    private static final int CAPACITY = 5;

    /**
     * Instantiates a new my array list.
     */
    public Picture() {
        this(CAPACITY);
    }

    /**
     * Instantiates a new my array list.
     *
     * @param capacity2 the capacity 2
     */
    public Picture(int capacity2) {
        myShapes = new Object[capacity2];
        numElements = 0;
    }

    public boolean add(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        ensureSpareCapacity(1);
        myShapes[numElements] = obj;
        numElements++;
        return true;
    }

    public int size() {
        return numElements;
    }

    private void ensureSpareCapacity(int i) {
        if (size() + i <= myShapes.length) {
            return;
        }
        Object[] newItems = new Object[myShapes.length * 2 + i];
        for (int k = 0; k < size(); k++) {
            newItems[k] = myShapes[k];
        }
        myShapes = newItems;

    }

    @Override
    public String toString() {
        return Arrays.toString(myShapes);
    }

}