package mike;

import static org.junit.Assert.*;

import org.junit.Test;

public class DomePalindromeCheckTest {
    public boolean reverse( String word ) {
        return word.equalsIgnoreCase( new StringBuffer( word ).reverse().toString() );
    }

    public boolean noReverse( String word ) {
        int i = 0;
        int j = word.length() - 1;
        while( i < j ) {
            Character early = Character.toLowerCase( word.charAt( i ) );
            Character late = Character.toLowerCase( word.charAt( j ) );
            System.out.println( String.format( "Comparing %d[%s] to %d[%s]",
                                               i, early, j, late ) );
            if( early != late ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    @Test
    public void testingNoReverse() {
        assertTrue( noReverse( "" ) );
        assertTrue( noReverse( "X" ) );
        assertTrue( noReverse( "ba AB" ) );
    }
}
