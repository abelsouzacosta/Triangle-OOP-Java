/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author junior
 */
public class Triangle {
    private final double a;
    private final double b;
    private final double c;
    
    public Triangle(double a, double b, double c) {
        SideValidator.areSidesPositiveValues(a, b, c);
        SideValidator.sidesFormTriangle(a, b, c);
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected double getA() {
        return this.a;
    }
    
    protected double getB() {
        return this.b;
    }
    
    protected double getC() {
        return this.c;
    }
}
