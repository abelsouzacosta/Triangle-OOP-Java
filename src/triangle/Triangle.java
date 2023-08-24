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
    private double a;
    private double b;
    private double c;
    
    public Triangle(double a, double b, double c) {
        SideValidator.areSidesPositiveValues(a, b, c);
        SideValidator.sidesFormTriangle(a, b, c);
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    protected void setA(double a) {
        this.a = a;
    }
    
    protected double getA() {
        return this.a;
    }
    
    protected void setB(double b) {
        this.b = b;
    }
    
    protected double getB() {
        return this.b;
    }
    
    protected void setC(double c) {
        this.c = c;
    }
    
    protected double getC() {
        return this.c;
    }
}
