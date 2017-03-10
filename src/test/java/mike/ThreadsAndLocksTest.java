package mike;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

class Foo implements Runnable {
    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() );
    }
}

public class ThreadsAndLocksTest {
    @Test
    public void foo() {
        System.out.println( Thread.currentThread().getName() );
        Thread thread = new Thread( new Foo() );
        thread.start();
    }
}
