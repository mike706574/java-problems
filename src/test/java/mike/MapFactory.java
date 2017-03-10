package mike;

import java.util.Map;
import java.util.LinkedHashMap;

public class MapFactory {
    // Something like this is coming in Java 9...
    public static Map<Object, Object> mapOf( Object... objects ) {
        assert objects.length % 2 == 0;
        Map<Object, Object> map = new LinkedHashMap<>();
        for( int i = 0; i < objects.length; i += 2 ) {
            map.put( objects[i], objects[i + 1] );
        }
        return map;
    }
}
