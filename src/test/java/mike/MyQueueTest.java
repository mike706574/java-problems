package mike;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Stack;

class MyQueue<T> {
    Stack<T> newest;
    Stack<T> oldest;

    public MyQueue() {
        newest = new Stack<>();
        oldest = new Stack<>();
    }

    public T remove() {
        move();
        return oldest.pop();
    }

    public T peek() {
        move();
        return oldest.peek();
    }

    public void add( T item ) {
        newest.push( item );
    }

    private void move() {
        if( oldest.isEmpty() ) {
            while( !newest.isEmpty() ) {
                oldest.push( newest.pop() );
            }
        }
    }
}

public class MyQueueTest {
    @Test
    public void foo() {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        queue.add( 1 );
        queue.add( 2 );
        queue.add( 3 );

        assertEquals( new Integer( 1 ), queue.peek() );
        assertEquals( new Integer( 1 ), queue.remove() );
        assertEquals( new Integer( 2 ), queue.peek() );
        assertEquals( new Integer( 2 ), queue.remove() );
    }
}
