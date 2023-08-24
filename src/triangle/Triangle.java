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
    
    private void areSidesPositive() throws IllegalArgumentException {
        if (this.a <= 0 || this.b <= 0 || this.c <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
    }
    
    private void sidesFormTriangle() throws IllegalArgumentException {
        if (this.a >= this.b + this.c || this.b >= this.a + this.c || this.c >= this.a + this.b) {
            throw new IllegalArgumentException("Sides do not form a triangle");
        }
    }
    
}
