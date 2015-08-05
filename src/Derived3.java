/**
 * Created by aviad on 04/08/2015.
 */
public class Derived3 extends Base
{
    private int _num3;

    public Derived3 (int n, int n3)
    {
        super(n);
        _num3 = n3;
    }

    protected void doSomeWork()
    {
        multiplication();
        division();
    }

    public void multiplication()
    {
        super.doSomeWork();
        System.out.println("num3 = " + _num3);
        System.out.println("num * num3 = " + _num * _num3);
    }

    public void division()
    {
        super.doSomeWork();
        System.out.println("num3 = " + _num3);
        System.out.println("num / num3 = " + _num / _num3);
    }
}
