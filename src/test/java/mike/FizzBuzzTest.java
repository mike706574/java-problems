package mike;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {
    public List<String> fizzBuzz( int n ) {
        List<String> strs = new ArrayList<String>();
        for( int i = 1; i <= n; i++ ) {
            Boolean multipleOf3 = i % 3 == 0;
            Boolean multipleOf5 = i % 5 == 0;
            String str = Integer.toString( i );
            if( multipleOf3 ) {
                if( multipleOf5 ) {
                    str = "FizzBuzz";
                }
                else {
                    str = "Fizz";
                }
            }
            else if( multipleOf5 ) {
                str = "Buzz";
            }
            strs.add( str );
        }
        return strs;
    }

    @Test
    public void testFizzBuzz() {
        System.out.println( fizzBuzz( 100 ) );
    }
}
