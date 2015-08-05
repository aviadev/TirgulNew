/**
 * Created by aviad on 04/08/2015.
 */
public class Derived1 extends Base
{
    private int _num1;

    public Derived1 (int n, int n1)
    {
        super(n);
        _num1 = n1;
    }

    protected void doSomeWork()
    {
        multiplication();
    }

    public void multiplication()
    {
        super.doSomeWork();
        System.out.println("num = " + _num1);
        System.out.println("num * num1 = " + _num * _num1);
    }

}
