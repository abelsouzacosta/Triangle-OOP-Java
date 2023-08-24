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
        triangle = new Triangle(10, 11, 12);
    }
    
    @Test
    public void testGetA() {
        double result = this.triangle.getA();
        assertEquals(10, result, 0.0f);
    }
    
    @Test
    public void testGetB() {
        double result = this.triangle.getB();
        assertEquals(11, result, 0.0f);
    }
    
    @Test
    public void testGetC() {
        double result = this.triangle.getC();
        assertEquals(12, result, 0.0f);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfASideIsNegative() {
        this.triangle = new Triangle(-10, 10, 10);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfASideIsZero() {
        this.triangle = new Triangle(10, 0, 10);
    }
    
}
