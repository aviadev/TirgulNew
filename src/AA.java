/**
 * Created by aviad on 05/08/2015.
 */
public class AA
{
    private int _x;

    public AA() {_x = 1;}
    public AA (int x) {_x = x;}

    public int getX() {
        return _x;
    }

    public String toString()
    {
        return "x = " +getX();
    }
}
