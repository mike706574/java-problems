package mike;

import static org.junit.Assert.*;

import org.junit.Test;

public class DomeTwoSumTest {
    public static int[] findTwoSum( int[] list, int sum ) {
        for( int i = 0; i < list.length; i++ ) {
            for( int j = i + 1; j < list.length; j++ ) {
                if( list[i] + list[j] == sum ) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    @Test
    public void test() {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
