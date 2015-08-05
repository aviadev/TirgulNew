/**
 * Created by aviad on 04/08/2015.
 */
public class Derived2 extends Base
{
private int _num2;

        public Derived2 (int n, int n2)
        {
            super(n);
            _num2 = n2;
        }

        protected void doSomeWork()
        {
           division();
        }

        public void division()
        {
            super.doSomeWork();
            System.out.println("num2 = " + _num2);
            System.out.println("num / num2 = " + _num / _num2);
        }

}
