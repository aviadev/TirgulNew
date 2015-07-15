/**
 * Created by aviad on 14/07/2015.
 */
public class Node {
    public int _data;
    public Node _leftSon, _rightSon;

    public Node (int data)
    {
        _data = data;
        _leftSon = null;
        _rightSon = null;
    }

    public Node get_leftSon() {
        return _leftSon;
    }

    public Node get_rightSon() {
        return _rightSon;
    }

    public int get_data() {
        return _data;
    }

    public void set_data(int _data) {
        this._data = _data;
    }
}
