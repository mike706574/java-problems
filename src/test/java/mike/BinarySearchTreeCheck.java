package mike;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTreeCheck {
    private class Node {
        public int data;
        public Node left, right;
    }

    public boolean check( Node root ) {
        if( root == null ) {
            return false;
        }

        if( root.data < root.left.data ) {
            return false;
        }

        if( root.data > root.right.data ) {
            return false;
        }

        return check( root.left ) && check( root.right );
    }

    @Test
    public void testingNoReverse() {
    }
}
