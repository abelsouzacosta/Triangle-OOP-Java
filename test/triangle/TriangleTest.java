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
        triangle = new Triangle(1, 2, 3);
    }
    
    @Test
    public void testGetA() {
        double result = this.triangle.getA();
        assertEquals(1, result, 0.0f);
    }
    
    @Test
    public void testGetB() {
        double result = this.triangle.getB();
        assertEquals(2, result, 0.0f);
    }
    
    @Test
    public void testGetC() {
        double result = this.triangle.getC();
        assertEquals(3, result, 0.0f);
    }
    
    @Test
    public void testSetA() {
        double a = 10;
        this.triangle.setA(a);
        assertEquals(a, triangle.getA(), 0.0f);
    }
    
    @Test
    public void testSetB() {
        double b = 12;
        this.triangle.setB(b);
        assertEquals(b, triangle.getB(), 0.0f);
    }
    
    @Test
    public void testSetC() {
        double c = 23;
        this.triangle.setC(c);
        assertEquals(c, triangle.getC(), 0.0f);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfASideIsNegative() {
        this.triangle = new Triangle(-1, 2, 3);
        this.triangle.calculateArea();
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfASideIsZero() {
        this.triangle = new Triangle(0, 20, 30);
        this.triangle.calculateArea();
    }
    
    @Test
    public void testCalculateSemiPerimeter() {
        this.triangle = new Triangle(8, 8, 8);
        this.triangle.calculateSemiPerimeter();
        assertEquals(12, this.triangle.getSemiPerimeter(), 0.0f);
    }
    
    @Test
    public void testCalculateArea() {
        this.triangle = new Triangle(4, 13, 15);
        this.triangle.calculateArea();
        assertEquals(24, this.triangle.getArea(), 0.0f);
    }
}
