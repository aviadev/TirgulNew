/**
 * Created by aviad on 05/08/2015.
 */
public class BB extends AA
{
    private int _y;

    public BB() {_y = 2;}
    public BB(int x, int y) {super(x); _y = y;}


    public int getX() {
        return super.getX();
    }

    public int getY() {
        return _y;
    }


    public boolean equals(AA other) {
        return (getX() == other.getX());
    }


    public boolean equals(BB other) {
        return (getX() == other.getX() && (getY() == other.getY()));
    }

    public String toString()
    {
        return "x = " +getX() + " y = " + getY();
    }
}
