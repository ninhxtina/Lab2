/** Christina Ninh
 * CSSKL143
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IntList {
    private int[] data;
    private int numElements;

    public IntList()
    {
        data = (int[])new int[5];
        this.numElements = 0;
    }

    public void add(int n)
    {
        resize();
        data[numElements++] = n;
    }

    private void resize()
    {
        if ((numElements) >= data.length)
        {
            int[] temp = (int[]) new int[data.length + (data.length / 2)];
            for (int i = 0; i < data.length; i++)
            {
                temp[i] = data[i];
            }
            data = temp;
        }
    }

    @Override
    public String toString()
    {
        String retVal = "";
        for(int i = 0; i < data.length; i++)
        {
            if(data[i] != '\0')
            {
                retVal += "" + data[i] + " ";
            }

        }
        return "[" + retVal.trim() + "]";
    }

    public int indexOf(int target)
    {
        int retVal = -1;
        for(int i = 0; i < data.length; i++)
        {
            if(data[i] == target)
            {
                retVal = i;
                break;
            }
        }
        return retVal;
    }

    public int sum()
    {
        int retVal = 0;
        for(int i = 0; i < data.length; i++)
        {
            retVal += data[i];
        }
        return retVal;
    }

    public boolean save()
    {
        String fileName = "IntList_output.txt";
        FileWriter fw;
        PrintWriter pw;

        try {
            fw = new FileWriter(new File(fileName));
            pw = new PrintWriter(fw);
            for(int i = 0; i < data.length; i++)
            {
                if(data[i] != '\0')
                    pw.write(data[i] + System.lineSeparator());
            }
            pw.flush();
            fw.close();
            pw.close();

            System.out.println("All data have been successfully written to file: " + fileName + ".\n"
                    + "Check your project directory for the output file.");
            return true;
        } catch (IOException ex) {
            System.out.println("Error: Couldn't save to file: " + fileName + "\n");
            return false;
        }
    }
}
