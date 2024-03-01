package Root_classificatin.Root_classificatin;

import org.junit.Test;
import static org.junit.Assert.*;

public class RootsTest {
	
    @Test
    public void testOutOfRange() {
        // Test out of range parameters
        Roots.calculate_roots(50, 1, 1);
        assertEquals(Root_Types.ERROR, Roots.getRootTypes());
    }

    @Test
    public void testEqualRoots() {
        // Test quadratic equation with equal roots
        Roots.calculate_roots(2, 3, 2);
        assertEquals(Root_Types.Equal_roots, Roots.getRootTypes());
    }

    @Test
    public void testTwoRoots() {
        // Test quadratic equation with two real roots
        Roots.calculate_roots(1, 3, 2);
        assertEquals(Root_Types.Two_roots, Roots.getRootTypes());
    }

    @Test
    public void testNoRoots() {
        // Test quadratic equation with no real roots
        Roots.calculate_roots(1, 2, 3);
        assertEquals(Root_Types.No_roots, Roots.getRootTypes());
    }

    @Test
    public void testNotQuadratic() {
        // Test non-quadratic equation
        Roots.calculate_roots(0, 1, 1);
        assertEquals(Root_Types.Not_quadratic, Roots.getRootTypes());
    }
}