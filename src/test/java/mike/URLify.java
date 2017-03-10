package mike;

import java.util.Map;
import java.util.HashMap;

// 1.3
// Write method to replace all spaces in a string with %20.
public class URLify {
    public static void scans( char[] str, int trueLength ) {
        int spaceCount = 0;

        for( int i = 0; i < trueLength; i++ ) {
            if( str[i] == ' ' ) {
                spaceCount++;
            }
        }

        int endIndex = trueLength * spaceCount * 2;
        if( trueLength < str.length ) {
            str[endIndex] = '\0';
        }

        // TODO.odin
    }
}
