package mike;

import static org.junit.Assert.*;

import static mike.MapFactory.*;

import org.junit.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 1.1
// Implement an algorithm to determine if a string has all unique characters.
// What is you cannot use addition data structures?
public class StringUniquenessTest {
    // Time: O(n^2)
    // Space: O(1)
    // Brute force approach.
    public static boolean doubleFor( String str ) {
        for( int i = 0; i < str.length(); i++ ) {
            for( int j = 0; j < str.length(); j++ ) {
                if( i != j && str.charAt( i ) == str.charAt( j ) ) {
                    return false;
                }
            }
        }
        return true;
    }

    // Time: O(n)
    // Space: O(n)
    // Uses a set to keep track of characters that have already been processed
    // while iterating over the characters the string, returning false when
    // the set already contains the current character.
    public static boolean withSet( String str ) {
        Set<Character> characters = new HashSet<>();

        for( int i = 0; i < str.length(); i++ ) {
            char character = str.charAt( i );
            if( characters.contains( character ) ) {
                return false;
            }
            characters.add( character );
        }

        return true;
    }

    private Map cases() {
        return mapOf( "", true,
                      "abc", true,
                      "abb", false,
                      "aa", false,
                      "aba", false );
    }

    @Test
    public void testingDoubleFor() {
        Map expected = cases();
        expected.keySet().forEach( key -> {
                String str = (String)key;
                assertEquals( String.format( "[[\"%s\" -> %s]]",
                                             str,
                                             expected.get( str ) ),
                              expected.get( str ),
                              doubleFor( str ) );
            } );
    }

    @Test
    public void testingWithSet() {
        Map expected = cases();
        expected.keySet().forEach( key -> {
                String str = (String)key;
                assertEquals( String.format( "[[\"%s\" -> %s]]",
                                             str,
                                             expected.get( str ) ),
                              expected.get( str ),
                              withSet( str ) );
            } );
    }
}
