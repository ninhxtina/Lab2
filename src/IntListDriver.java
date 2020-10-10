/** Christina Ninh
 * CSSKL143
 */
public class IntListDriver {

    public static void main(String[] args)
    {
        IntList a = new IntList();

        a.add(95);
        a.add(100);
        a.add(58);

        System.out.println(a.toString());
        System.out.println(a.sum());
        System.out.println(a.indexOf(100));
        System.out.println(a.indexOf(20));
        System.out.println(a.save());
    }
}