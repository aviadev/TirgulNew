/**
 * Created by aviad on 14/07/2015.
 */
public class D extends B {
    private static int numD = 0;
    private double _d;

    public D (double d, int x)
    {
        super(x, x);
        _d = d;
        numD++;
        System.out.println("D("+_d+","+x+") numD= " +numD);
    }

    public D (double d, int x, int y)
    {
        super(x, x);
        _d = d;
        numD++;
        System.out.println("D("+_d+","+x+","+y+") numD= " +numD);
    }

    public void f (D d)
    {
        System.out.println("dd");
    }

    public void f (B b)
    {
        System.out.println("db");
    }
}
