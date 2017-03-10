package mike;

import java.util.Arrays;

public class CheatStringSort {
    public static String sort( String str ) {
        char[] arr = str.toCharArray();
        Arrays.sort( arr );
        return new String( arr );
    }
}
