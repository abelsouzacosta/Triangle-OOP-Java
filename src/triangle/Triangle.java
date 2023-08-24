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
    private double semi_perimeter;
    private double area;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getA() {
        return this.a;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public double getB() {
        return this.b;
    }
    
    public void setC(double c) {
        this.c = c;
    }
    
    public double getC() {
        return this.c;
    }
    
    private void areSidesPositive() throws IllegalArgumentException {
        if (this.a <= 0 || this.b <= 0 || this.c <= 0) {
            throw new IllegalArgumentException("Sides must be positive");
        }
    }
    
    private void sidesFormTriangle() throws IllegalArgumentException {
        if (this.a <= this.b + this.c || this.b <= this.a + this.c || this.c <= this.a + this.b) {
            throw new IllegalArgumentException("Sides not form a triangle");
        }
    }
}
