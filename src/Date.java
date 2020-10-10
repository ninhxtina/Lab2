/** Christina Ninh
 * CSSKL143
 */
public class Date {
//class-level variables
    int day;
    int month;
    int year;

    //function to set the date
    public void setDate(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    //this method will print the date, you can remove if you did not want it
    public void report()
    {
        System.out.println(month + "/" + day + "/" + year);
    }

//Test the date class from the Main
public void main() {

        Date date = new Date();
        date.setDate(10,21,2015);
        date.report();
    }
}
