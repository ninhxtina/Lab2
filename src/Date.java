/** Christina Ninh
 * CSSKL143
 *
 * 1. What does it mean to be a Date?
 * - What data items do you need to keep track of?
 * - Alternatively, what does a date have?
 * A date should have a month, day, and year. We need to keep track of these variables.
 *
 * 2. What can a date do?
 * - What are the actions and verbs that can be applied to a date?
 * You can set the date, and print out what the date is.
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
