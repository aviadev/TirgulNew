/**
 * Created by aviad on 04/08/2015.
 */
public class Base
{
    protected int _num;

    public Base (int n)
    {
        _num = n;
    }

    protected void doSomeWork ()
    {
        System.out.println("num = " + _num);
    }

    public void run ()
    {
        if (_num % 2 == 0)
            doSomeWork();
    }
}
