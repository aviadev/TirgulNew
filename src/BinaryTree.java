import java.util.Stack;

/**
 * Created by aviad on 14/07/2015.
 */
public class BinaryTree {

    public static boolean f(Node t)
    {
        return t.get_leftSon() == null && t.get_rightSon() == null;
    }

    public static void g (Node t, Stack s)
    {
        if (t != null) {
            if (f(t))
                s.push(t.get_data());
            else
            {
                g(t.get_rightSon(), s);
                g(t.get_leftSon(), s);
            }
        }
    }

    public static Node secret (Node root, Node p, Node q)
    {
        if (root == null) return null;
        if (root == p || root == q) return root;
        Node left = secret(root.get_leftSon(), p, q);
        Node right = secret(root.get_rightSon(), p, q);

        if (left != null && right != null) return root;
        if (left != null && right == null) return left;
        return right;
    }
}
