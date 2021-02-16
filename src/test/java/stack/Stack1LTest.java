package stack;
import junit.framework.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class Stack1LTest {

    @Test
    public void testConstructor() {
        Stack1L<Integer> stack = new Stack1L<Integer>();
        assertNotNull(stack);
    }
}
