/**
 * Created by aviad on 14/07/2015.
 */
public class B {
    private static int numB = 0;
    private int _m1, _m2;

    public B (int m1, int m2)
    {
        _m1 = m1;
        _m2 = m2;
        numB ++;
        System.out.println("B("+m1+","+m2+") numB= " + numB);
    }

    public void f (D d)
    {
        System.out.println("bd");
    }

    public void f (B b)
    {
        System.out.println("bb");
    }
}
