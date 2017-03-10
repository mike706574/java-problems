package mike;

import static org.junit.Assert.*;

import org.junit.Test;

// https://www.testdome.com/for-developers/solve-question/7483
public class DomeBinarySearchTreeTest {
    private class Node {
        public int value;
        public Node left, right;

        public Node( int value, Node left, Node right ) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    // Time: O(n)
    public boolean bruteForce( Node root, int value ) {
        if( root == null ) {
            return false;
        }

        if( root.value == value ) {
            return true;
        }

        return bruteForce( root.left, value ) || bruteForce( root.right, value );
    }

    @Test
    public void testBruteForce() {
        Node n1 = new Node( 1, null, null);
        Node n3 = new Node( 3, null, null);
        Node n2 = new Node( 2, n1, n3);

        assertFalse( bruteForce( n2, 0 ) );
        assertTrue( bruteForce( n2, 1 ) );
        assertTrue( bruteForce( n2, 2 ) );
        assertTrue( bruteForce( n2, 3 ) );
        assertFalse( bruteForce( n2, 4 ) );
    }

    // Time: O(log n)
    public boolean actualSearch( Node root, int value ) {
        if( root == null ) {
            return false;
        }
        if( root.value == value ) {
            return true;
        }
        Node branch = root.value > value ? root.left : root.right;
        return actualSearch( branch, value );
    }

    @Test
    public void testActualSearch() {
        Node n1 = new Node( 1, null, null);
        Node n3 = new Node( 3, null, null);
        Node n2 = new Node( 2, n1, n3);

        assertFalse( actualSearch( n2, 0 ) );
        assertTrue( actualSearch( n2, 1 ) );
        assertTrue( actualSearch( n2, 2 ) );
        assertTrue( actualSearch( n2, 3 ) );
        assertFalse( actualSearch( n2, 4 ) );
    }
}
