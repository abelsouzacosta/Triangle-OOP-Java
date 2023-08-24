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
public class AreaCalculatorTest {
    
    private AreaCalculator calculator;
    
    public AreaCalculatorTest() {}
    
    @Before
    public void setUp() {
        this.calculator = new AreaCalculator();
    }
    
    @Test
    public void testCalculateArea() {
        this.calculator.calculateArea(4, 13, 15);
        assertEquals(24, this.calculator.getArea(), 0.0f);
    }
}
