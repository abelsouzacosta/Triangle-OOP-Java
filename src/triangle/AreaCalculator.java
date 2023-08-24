/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author junior
 */
public class AreaCalculator {
    private double semi_perimeter;
    private double area;
    
    public AreaCalculator() {}
    
    private void calculateSemiPerimeter(double a, double b, double c) {
        SideValidator.areSidesPositiveValues(a, b, c);
        SideValidator.sidesFormTriangle(a, b, c);
        this.semi_perimeter = (a + b + c) / 2;
    }
    
    /**
     * Calculate the area of triangle
     * @param a - first side of triangle
     * @param b - second side of triangle
     * @param c - third side of triangle
     */
    protected void calculateArea(double a, double b, double c) {
        this.calculateSemiPerimeter(a, b, c);
        this.area = Math.sqrt(
                this.getSemiPerimeter() *
                (this.getSemiPerimeter() - a) *
                (this.getSemiPerimeter() - b) *
                (this.getSemiPerimeter() - c)
        );
    }
    
    protected double getSemiPerimeter() {
        return this.semi_perimeter;
    }
    
    protected double getArea() {
        return this.area;
    }
    
}
