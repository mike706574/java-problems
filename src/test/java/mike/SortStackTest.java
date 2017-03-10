package mike;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class SortStackTest {
    public Stack<Integer> sort( Stack<Integer> stack ) {
        Stack<Integer> sorted = new Stack<>();
        sorted.push( stack.pop() );

        while( !stack.isEmpty() ) {
            Integer number = stack.pop();

            Integer lesserCount = 0;

            while( !sorted.isEmpty() && sorted.peek() > number ) {
                stack.push( sorted.pop() );
                lesserCount++;
            }

            sorted.push( number );

            for( int i = 0; i < lesserCount; i++ ) {
                sorted.push( stack.pop() );
            }
        }
        stack = sorted;
        return stack;
    }

    @Test
    public void foo() {
        Stack<Integer> stack = new Stack<>();

        stack.push( 3 );
        stack.push( 2 );
        stack.push( 1 );
        stack.push( 1 );
        stack.push( 5 );
        stack.push( 4 );

        System.out.println( stack );
        Stack<Integer> out = sort( stack );
        System.out.println( out );
    }
}
