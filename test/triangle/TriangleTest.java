/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package triangle;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author junior
 */
public class TriangleTest {
    
    private Triangle triangle;
    
    public TriangleTest() {
        
    }
    
    @Before
    public void setUp() {
        triangle = new Triangle();
    }
    
    @Test
    public void testSetA() {
        double a = 10;
        triangle.setA(a);
        assertEquals(a, triangle.getA(), 0.0f);
    }
    
    @Test
    public void testSetB() {
        double b = 12;
        triangle.setB(b);
        assertEquals(b, triangle.getB(), 0.0f);
    }
    
    @Test
    public void testSetC() {
        double c = 23;
        triangle.setC(c);
        assertEquals(c, triangle.getC(), 0.0f);
    }
    
}
