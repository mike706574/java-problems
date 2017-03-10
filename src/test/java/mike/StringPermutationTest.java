package mike;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

// 1.2
// Given two strings, write a method to decide if one is a permutation of the
// other.
public class StringPermutationTest {
    public static boolean withSorting( String a, String b ) {
        if( a.length() != b.length() ) {
            return false;
        }
        return CheatStringSort.sort( a ).equals( CheatStringSort.sort( b ) );
    }

    @Test
    public void testingWithSorting() {
        assertTrue( withSorting( "ab", "ba" ) );
        assertTrue( withSorting( "banana", "aannba" ) );
        assertFalse( withSorting( "a", "b" ) );
        assertFalse( withSorting( "abba", "abba " ) );
    }
}
