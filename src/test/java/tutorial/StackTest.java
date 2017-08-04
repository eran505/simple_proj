package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void test() {
      System.out.println("in_test");
	    Stack<Object> stack = new Stack<Object>();
	    stack.push(new Object());
	    assertFalse(stack.isEmpty());
      System.out.println("out_test");
    }
}
