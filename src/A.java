/**
 * Created by aviad on 14/07/2015.
 */
public class A {
    private static int numA = 0;
    private A _a;
    private B _b;

    public A (A a, B b)
    {
        _a = a;
        _b = b;
        numA ++;
        System.out.println("A Constructor, numA= " + numA);
    }
}
